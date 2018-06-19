#include <stdlib.h>
#include <stdio.h>

typedef struct Dlist Dlist;
struct Dlist {
   int elt;
   Dlist* suivant;
   Dlist* precedent;   
};

void display(Dlist* l) {
   printf("[");
   if (l != NULL) {
       while (l->suivant != NULL) {
           printf("%d,", l->elt);
           l = l->suivant;           
       }
       printf("%d", l->elt);
   }
   printf("]\n");    
}