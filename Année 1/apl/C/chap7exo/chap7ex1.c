#include <stdio.h>
#include <stdlib.h>

void ordre (int*a,int*b,int*c) {
  int temp;
  temp=*a;
  *a=*b;
  *b=*c;
  *c=temp;
}

int main () {

  int c1,c2,c3;
  scanf("%d %d %d",&c1,&c2,&c3);
  ordre(&c1,&c2,&c3);
  printf("%d %d %d\n",c1,c2,c3);
  return 0;
}
