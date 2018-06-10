#include <stdio.h>

int main() {
 
  int v1,res;
  double v2;
  scanf("%d %lf",&v1,&v2);
  res = (v1 == (int)v2);
  printf("%d\n",res);
  return 0;
}
