#include <stdio.h>

int main() {
 
  int v1,v2,c,d,u,res; 
  scanf("%d %d", &v1,&v2);
  c=v1/100;
  d=(v1/10)%10;
  u=v1%10;

  res = v2==c || v2==d || v2==u;

  printf("%d\n",res);

  return 0;
}
