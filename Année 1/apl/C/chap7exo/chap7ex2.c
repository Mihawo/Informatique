#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void rant (int*a,char*c) {

  int oe =(rand() % (13-1+1))+1;
  int oee =(rand() % (4-1+1))+1;

  *a=oe;

  if(oee==1)
    *c='T';

  else if(oee==2)
    *c='P';

  else if(oee==3)
    *c='C';
  
  else if(oee==4)
    *c='K';
}

int main () {
  int c;
  char ch;
  
  srand(time(NULL));

  rant(&c,&ch);
  
  printf("%d %c\n",c,ch);

  return 0;
}
