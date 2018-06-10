#include <stdio.h>

int main() {
 
  int v1,c,d,u,res; 
  scanf("%d",&v1);

  c=v1/100;
  d=v1/10;
  u=v1%10;

  res = c>=1 && c<=9;

  printf("%d\n",res);
  return 0;
}
