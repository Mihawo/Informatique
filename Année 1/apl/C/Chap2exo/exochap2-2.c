#include <stdio.h>

int main() {
 
  int v1,v2,res;
  scanf("%d",&v1);
  v2 = v1 % 4;
  res = (v2 == 0);
  
  printf("%d\n",res);
  return 0;
}
