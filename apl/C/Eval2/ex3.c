#include <stdio.h>
#include <stdlib.h>

struct list {
  int elt;
  struct list* next;
};

struct list* join(struct list* l1, struct list* l2) {

  struct list* n = (struct list*) malloc(sizeof(struct list));
  n->next=l1;

}
int main (int argc,char* argv[]) {

}
