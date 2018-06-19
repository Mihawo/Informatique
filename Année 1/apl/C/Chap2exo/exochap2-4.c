#include <stdio.h>

int main() {
 
  int v1,u,d,res; // u=unité, d=dizaine
  scanf("%d",&v1);
  u=v1%10;
  d=v1/10;

  res = (v1 == 7) || (u == 7) || (d == 7) || (u+d == 7) || v1%7==0;
 
  printf("%d\n",res);
  return 0;
}
