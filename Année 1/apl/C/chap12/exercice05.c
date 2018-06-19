#include <stdlib.h>
#include <stdio.h>

typedef struct Dlist Dlist;
struct Dlist {
   int elt;
   Dlist* suivant;
   Dlist* precedent;   
};

void reverse_display(Dlist* l) {
   if (l == NULL) {
       printf("[]\n");
       return;
   }
   
   while (l->suivant != NULL)
       l = l->suivant;
   printf("[");   
   while (l->precedent != NULL) {
       printf("%d,", l->elt);
       l = l->precedent;           
   }
   printf("%d]\n", l->elt);
}