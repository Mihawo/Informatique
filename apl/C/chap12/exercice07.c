#include <stdlib.h>
#include <stdio.h>

typedef struct Dlist Dlist;
struct Dlist {
   int elt;
   Dlist* suivant;
   Dlist* precedent;   
};

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