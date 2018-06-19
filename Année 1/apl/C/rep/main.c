#include <stdio.h>
#include "exercice01.h"
#include "exercice2.h"

int main(int argc,char* argv[]) {

  int tmp;
  printf("Exercice?\n");
  scanf("%d",&tmp);

  if(tmp==1)
    f1();
  if(tmp==2)
    f2();

  return 0;

}
