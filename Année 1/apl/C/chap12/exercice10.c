#include <stdlib.h>
#include <stdio.h>

typedef struct Dlist Dlist;
struct Dlist {
   int elt;
   Dlist* suivant;
   Dlist* precedent;   
};

int first_occ(Dlist* liste, int elt) {
   int i = 0;
   Dlist* tmp;
   for (tmp = liste; tmp != NULL; tmp = tmp->suivant) {
      if (tmp->elt == elt)
         return i;
      i++;
   }
   return -1;
}

