#include <stdio.h>
#include <stdlib.h>

enum E_couleur {e_pique, e_coeur, e_trefle, e_carreau};

struct Carte {
	int valeur;
	enum E_couleur couleur;
};

struct Paquet {
	struct Carte cartes[52];
	int nb_carte;
};

struct Joueur {
	char* nom;
	int somme;
	int mise;
	struct Carte main[5];
	int nb_carte;
	int est_robot;
	int est_couche;
};

struct Jeu {
	struct Paquet* paquet;
	struct Joueur* joueurs;
	int nb_joueurs;
	int premier;
};

void affiche_carte(struct Carte* carte) {
	char* valeur;
	static char* v[13] = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi"};
	valeur = v[carte->valeur - 1];
	
	char* couleur;
	static char* c[13] = {"Pique", "Coeur", "Trefle", "Carreau"};	
	couleur = c[carte->couleur];
        	
	printf("%s %s", valeur, couleur);
}

void affiche_main(struct Joueur* joueur) {
	int i;
	for (i = 0; i < joueur->nb_carte - 1; ++i) {
		affiche_carte(&(joueur->main[i]));
		printf(" - ");
	}
	affiche_carte(&(joueur->main[i]));
	printf("\n");	
}

void init(struct Paquet* jeu) {
	int i;
	for (i = 0; i < 13; ++i) {
		jeu->cartes[i].valeur = i+1;
		jeu->cartes[i].couleur = e_pique;
	}
	
	for (i = 0; i < 13; ++i) {
		jeu->cartes[13+i].valeur = i+1;
		jeu->cartes[13+i].couleur = e_coeur;
	}

	for (i = 0; i < 13; ++i) {
		jeu->cartes[26+i].valeur = i+1;
		jeu->cartes[26+i].couleur = e_carreau;
	}

	for (i = 0; i < 13; ++i) {
		jeu->cartes[39+i].valeur = i+1;
		jeu->cartes[39+i].couleur = e_trefle;
	}
	jeu->nb_carte = 52;
}

void melange_help(struct Paquet* jeu, int c1, int c2) {
	struct Carte tmp = jeu->cartes[c1];
	jeu->cartes[c1] = jeu->cartes[c2];
	jeu->cartes[c2] = tmp;
}


void melange(struct Paquet* jeu) {
	int i;
	for (i = 0; i < 1000; ++i) {
		int c1 = rand() % jeu->nb_carte;
		int c2 = rand() % jeu->nb_carte;
		
		melange_help(jeu, c1, c2);
	}
}

void distribuer_un(struct Paquet* jeu, struct Joueur* joueur) {
	if (joueur->nb_carte == 5 || jeu->nb_carte == 0)
		return;
	joueur->main[joueur->nb_carte] = jeu->cartes[jeu->nb_carte - 1];
	joueur->nb_carte++;
	jeu->nb_carte--;
}

void echanger(struct Paquet* jeu, struct Joueur* joueur, int i) {
	if (i < 0 || i >= jeu->nb_carte || jeu->nb_carte == 0)
		return;
	int c1 = rand() % jeu->nb_carte;		
	struct Carte tmp = jeu->cartes[c1];
	jeu->cartes[c1] = joueur->main[i];
	joueur->main[i] = tmp;
}

struct Jeu* creer_jeu(char* names[], int est_robot[], int nb_joueurs, int somme) {
	if (nb_joueurs <= 1 || nb_joueurs >= 8)
		return NULL;

	struct Jeu* jeu = (struct Jeu*) malloc(sizeof(struct Jeu));
	jeu->paquet = (struct Paquet*) malloc(sizeof(struct Paquet));
	jeu->joueurs = (struct Joueur*) malloc(sizeof(struct Joueur) * nb_joueurs);
	jeu->nb_joueurs = nb_joueurs;
	int i;
	for (i = 0; i < nb_joueurs; ++i) {
		jeu->joueurs[i].nb_carte = 0;
		jeu->joueurs[i].nom = names[i];
		jeu->joueurs[i].somme = somme;
		jeu->joueurs[i].mise = 0;
		jeu->joueurs[i].est_robot = est_robot[i];
	}
	
	jeu->premier = 0;
	
	return jeu;
}

void distribuer(struct Jeu* jeu) {
	int i;
	for (i = 0; i < 5; ++i) {
		int j;
		for (j = 0; j < jeu->nb_joueurs; ++j) {
			distribuer_un(jeu->paquet, jeu->joueurs + j);
		}
	}
}

void init_jeu(struct Jeu* jeu) {
	init(jeu->paquet);
	int i;
	for (i = 0; i < jeu->nb_joueurs; ++i) {
		jeu->joueurs[i].nb_carte = 0;
		jeu->joueurs[i].mise = 0;
		jeu->joueurs[i].est_couche = 0;
	}
	jeu->premier = 	(jeu->premier + 1) % jeu->nb_joueurs;
}

int changer_carte_joueur(struct Jeu* jeu, int cur) {
	int nb = -1;	
	while (nb < 0 || nb > 5) {
		printf("Combien voulez-vous changer de cartes ? \n");	
		scanf("%d", &nb);
		getchar();
	}
	int i;
	for (i = 0; i < nb; ++i) {
		int c = -1;
		while (c < 0 || c > 5) {	
			printf("Carte a changer numéro %d ?\n", i);		
			scanf("%d", &c);
			getchar();
		}
		echanger(jeu->paquet, jeu->joueurs + cur, c);
	}
	return nb;
}

int changer_carte_robot(struct Jeu* jeu, int cur) {
	return 0;
}

int mise_joueur(struct Jeu* jeu, int cur) {

	int prec;
	if (cur == 0)
		prec = jeu->nb_joueurs - 1;
	else
		prec = cur - 1;

	printf("Votre somme d'argent : %d\n", jeu->joueurs[cur].somme);
	printf("Votre mise actuelle : %d\n", jeu->joueurs[cur].mise);
	
	int mise = -1;
	int min = jeu->joueurs[prec].mise - jeu->joueurs[cur].mise;
	while (mise < 0 || mise + jeu->joueurs[cur].mise > jeu->joueurs[cur].somme || (mise < min && mise != 0)) {
		printf("Combien voulez-vous miser ? (0 = se coucher)\n");
		scanf("%d", &mise);
		getchar();
	}
	printf("Le joueur %s mise %d\n", jeu->joueurs[cur].nom, mise);
	jeu->joueurs[cur].mise += mise;
	return mise;
}

int mise_robot(struct Jeu* jeu, int cur) {
	int prec;
	if (cur == 0)
		prec = jeu->nb_joueurs - 1;
	else
		prec = cur - 1;
	int min = jeu->joueurs[prec].mise - jeu->joueurs[cur].mise;
	if (jeu->joueurs[cur].mise + min > jeu->joueurs[cur].somme)
		min = 0;
	jeu->joueurs[cur].mise += min;
	return min;
}


int gagnant2(struct Joueur* j1, struct Joueur* j2) {
	return 0;
}

int gagnant(struct Jeu* jeu) {
	int i;
	int cur = 0;
	for (i = 1; i < jeu->nb_joueurs; ++i) {
		if (!jeu->joueurs[i].est_couche) {
			if (gagnant2(jeu->joueurs + cur, jeu->joueurs + i)) {
				cur = i;
			}
		}
	}
	return cur;
}

void jouer_change_card(struct Jeu* jeu) {
	int i;
	int cur = jeu->premier;

	printf("\n\n ******* Changement de Cartes : ******* \n");
	getchar();
	for (i = 0; i < jeu->nb_joueurs; ++i) {
		printf("\nDébut tour joueur %s :\n", jeu->joueurs[cur].nom);
		getchar();
		int nb;
		if (jeu->joueurs[cur].est_robot) {
			nb = changer_carte_robot(jeu, cur);				
		} else {
			printf("Votre main : ");
			affiche_main(&(jeu->joueurs[cur]));
			printf("Votre somme d'argent : %d\n", jeu->joueurs[cur].somme);
			nb = changer_carte_joueur(jeu, cur);
			printf("\nVotre nouvelle main : ");
			affiche_main(&(jeu->joueurs[cur]));				
		}
		printf("Le joueur %s a changé %d cartes\n", jeu->joueurs[cur].nom, nb);
		printf("Fin tour joueur %s\n", jeu->joueurs[cur].nom);			
		cur = (cur + 1) % jeu->nb_joueurs;
	}	
}

void jouer_mises(struct Jeu* jeu) {
	printf("\n\n ******* Mises : *******\n");
	getchar();
	int cur = jeu->premier;
	int i = 0;
	int derniere_mise = 0;
	int nb_joueur_pas_couche = jeu->nb_joueurs;
	while (i < nb_joueur_pas_couche) {
		printf("\nDébut tour joueur %s :\n", jeu->joueurs[cur].nom);
		getchar();
		int mise;
		if (jeu->joueurs[cur].est_couche) {
			printf("Joueur couché\n");
		} else {
			if (jeu->joueurs[cur].est_robot) {
				mise = mise_robot(jeu, cur);
				printf("Le joueur %s mise %d\n", jeu->joueurs[cur].nom, mise);
			} else {
				printf("Votre main : ");
				affiche_main(&(jeu->joueurs[cur]));
				mise = mise_joueur(jeu, cur);
			}
			if (mise == 0) {
				jeu->joueurs[cur].est_couche = 1;
				nb_joueur_pas_couche--;
			} else {								
				if (jeu->joueurs[cur].mise == derniere_mise)
					i++;
				else if (jeu->joueurs[cur].mise > derniere_mise)
					i = 1;
			
				derniere_mise = jeu->joueurs[cur].mise;
			}
		}
		
		printf("Fin tour joueur %s\n", jeu->joueurs[cur].nom);			
		cur = (cur + 1) % jeu->nb_joueurs;
	}	
}


void jouer(struct Jeu* jeu) {
	jeu->premier = -1;
	while (1) {
		init_jeu(jeu);
		distribuer(jeu);
		
		jouer_change_card(jeu);
		jouer_mises(jeu);
				
		int winner = gagnant(jeu);

		printf("\n\n ******* Gagnant : *******\n");
		getchar();
		printf("Les mains des joueurs sont :\n");
		int i;
		for (i = 0; i < jeu->nb_joueurs; ++i) {
			printf("%s : ", jeu->joueurs[i].nom);
			if (jeu->joueurs[i].est_couche)
				printf("couché\n");
			else
				affiche_main(&(jeu->joueurs[i]));
			getchar();
		}
		
		printf("Le joueur %s remporte la mise\n", jeu->joueurs[winner].nom);
		for (i = 0; i < jeu->nb_joueurs; ++i) {
			jeu->joueurs[winner].somme += jeu->joueurs[i].mise;
			jeu->joueurs[i].somme -= jeu->joueurs[i].mise;
			jeu->joueurs[i].mise = 0;
		}
		for (i = 0; i < jeu->nb_joueurs; ++i) {
			printf("La somme du joueur %s est maintenant de : %d\n", jeu->joueurs[i].nom, jeu->joueurs[i].somme);
		}
		
	}
}

int main(int argc, char* argv[]) {
	char* names[3] = {"Eric", "Plop", "Cindy"};
	int robot[3] = {0, 0, 0};
	
	struct Jeu* jeu = creer_jeu(names, robot, 3, 100);
	jouer(jeu);
	
	return 0;
}