#include <stdlib.h>

typedef struct Dlist Dlist;
struct Dlist {
   int elt;
   Dlist* suivant;
   Dlist* precedent;   
};

Dlist* ajout_queue(Dlist* l, int elt) {
   Dlist* n = (Dlist*) malloc(sizeof(Dlist));
   n->elt = elt;
   n->suivant = NULL;
   
   if (l == NULL) {     
       n->precedent = NULL;
       return n;
   }
   
   Dlist* tmp = l;
   while (tmp->suivant != NULL) {
       tmp = tmp->suivant;
   }
   n->precedent = tmp;
   tmp->suivant = n;

   return l;
}