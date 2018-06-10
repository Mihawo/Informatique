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
