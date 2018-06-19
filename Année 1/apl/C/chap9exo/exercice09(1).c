#include <stdio.h>
#include <stdlib.h>

int abs(int x) {
   if (x < 0)
      return -x;
   return x;
}

/* Regarde si la position des M premières dames est OK*/
int positionOk(int N, int M, int* posX, int* posY) {
   int i,j,k;
   
   for (i = 0; i <= M; ++i) {
      for (j = i+1; j <= M; ++j) {   
         if (posX[i] == posX[j])
            return 0;
            
         if (abs(posX[i] - posX[j]) == abs(posY[i] - posY[j]))
            return 0;
      }
   }
   
   return 1;
}

/* L'algorithme récursif */
int damesRec(int N, int M, int* posX, int* posY) {   
   if (M == N)
      return 1;

   int i;   
   for (i = 0; i < N; ++i) {   
      posX[M] = i;
      if (positionOk(N, M, posX, posY)) {      
         if (damesRec(N, M+1, posX, posY))
            return 1;
      }
   }
   
   return 0;
}

void affichage(int N, int* posx, int*posy) {
   /* Affichage */   
   for (i = 0; i < N; ++i) {
      tab[posx[i]][posy[i]] = 1;
      printf("Dame %d posx=%d posy=%d\n", i+1, posx[i], posy[i]);
   }

   for (i = 0; i < N; ++i) {
      for (j = 0; j < N; ++j) {
         if (tab[i][j] == 0)
            printf("*");
         else
            printf("D");
      }
      printf("\n");
   }      
   
   /* Libère la mémoire allouée */
   for (i = 0; i < N; ++i) {
      free(tab[i]);
   } 
        
   free(tab);
}

void dames(int N) {
   int* posx = (int*) malloc(sizeof(int) * N);
   int* posy = (int*) malloc(sizeof(int) * N);      
   
   int i;
   for (i = 0; i < N; ++i) {
      posx[i] = 0;
      posy[i] = i;      
   }
   
   damesRec(N, 0, posx, posy);
      
   /* Pour l'affichage, création d'un tableau à deux dimensions */
   int** tab = (int**) malloc(sizeof(int*) * N);
   for (i = 0; i < N; ++i) {
      tab[i] = (int*) malloc(sizeof(int) * N);
      for (j = 0; j < N; ++j) {
         tab[i][j] = 0;
      }
   }
   
   affichage(N, posx, posy);
   free(posx);
   free(posy);
}