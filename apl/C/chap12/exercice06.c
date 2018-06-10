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