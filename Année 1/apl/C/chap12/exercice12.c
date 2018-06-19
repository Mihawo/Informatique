#include <stdlib.h>
#include <stdio.h>

typedef struct Dlist Dlist;
struct Dlist {
   int elt;
   Dlist* suivant;
   Dlist* precedent;   
};

Dlist* trier(Dlist* liste) {
   Dlist* cur1, * cur2;
   for (cur1 = liste; cur1 != NULL; cur1 = cur1->suivant) {
      for (cur2 = cur1->suivant; cur2 != NULL; cur2 = cur2->suivant) {   
         if (cur2->elt < cur1->elt) {
            int tmp = cur2->elt;
            cur2->elt = cur1->elt;
            cur1->elt = tmp;
         }
      }
   }
   
   return liste;
}