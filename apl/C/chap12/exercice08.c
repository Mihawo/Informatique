#include <stdlib.h>
#include <stdio.h>

typedef struct Dlist Dlist;
struct Dlist {
   int elt;
   Dlist* suivant;
   Dlist* precedent;   
};

Dlist* supprimer_premier(Dlist* l) {
   if (l == NULL) {
       return NULL;
   }

   if (l->suivant == NULL) {
       free(l);
       return NULL;
   }   
   
   Dlist* tmp = l->suivant;
   tmp->precedent = NULL;
   free(l);
   return tmp;
}

Dlist* supprimer_dernier(Dlist* l) {
   if (l == NULL) {
       return NULL;
   }

   if (l->suivant == NULL) {
       free(l);
       return NULL;
   }   
   
   Dlist* tmp = l;
   while (tmp->suivant->suivant != NULL)
       tmp = tmp->suivant;
   free(tmp->suivant);
   tmp->suivant = NULL;
   
   return l;
}

Dlist* supprimer(Dlist* l, int p) {       
   int i;
   Dlist* tmp = l;
   for (i = 0; i < p && tmp != NULL; ++i)
      tmp = tmp->suivant;
   if (tmp == NULL)
      return l;

   if (tmp->suivant == NULL) {
      return supprimer_dernier(l);   
   }

   if (tmp->precedent == NULL) {
      return supprimer_premier(l);   
   }
   
   tmp->precedent->suivant = tmp->suivant;
   tmp->suivant->precedent = tmp->precedent;
   
   free(tmp);
   
   return l;
}