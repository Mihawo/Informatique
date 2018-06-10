#include <stdio.h>

int main() {
 
  int v1,v2,v3,res; 
  scanf("%d %d %d",&v1,&v2,&v3);
  res= v1>v2 && v1>v2 || v2>v1 && v2>v3 || v3>v1 && v3>v2;

  printf("%d\n",res);
  return 0;
}
