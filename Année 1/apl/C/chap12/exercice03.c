#include <stdlib.h>

typedef struct Dlist Dlist;
struct Dlist {
   int elt;
   Dlist* suivant;
   Dlist* precedent;   
};

Dlist* ajout_tete(Dlist* liste, int elt) {
   Dlist* n = (Dlist*) malloc(sizeof(Dlist));
   n->suivant = liste;
   n->precedent = NULL;   
   n->elt = elt;
   if (liste != NULL)
      liste->precedent = n;   
   return n;
}

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

Dlist* insertion(Dlist* l, int elt, int p) {
   int i;   
   Dlist* tmp = l;
   for (i = 0; i < p && tmp != NULL; ++i)
      tmp = tmp->suivant;
   if (tmp == NULL) {
      return ajout_queue(l, elt);
   }
   if (tmp->precedent == NULL) {
      return ajout_tete(l, elt);
   }
   
   Dlist* n = (Dlist*) malloc(sizeof(Dlist));
   n->suivant = tmp;
   n->precedent = tmp->precedent;   
   n->elt = elt;
   tmp->precedent->suivant = n;
   tmp->precedent = n;
   
   return l;
}