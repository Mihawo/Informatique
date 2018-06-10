#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>


typedef struct Pile Pile;
struct Pile {
  int elt;
  Pile* suivant;
};

Pile* empiler(Pile* p, int elt) {
  Pile* n=(Pile*)malloc(sizeof(Pile));
  n->elt=elt;
  n->suivant=NULL;
  if(p==NULL)
    return n;
  n->suivant=p;
  return n;
}
