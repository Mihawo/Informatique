#include <stdio.h>

int main() {
 
  int n1,n2,res; 
  scanf("%d %d", &n1, &n2);

  res = n1 != 0 && n2 != 0 || n1 == 0 && n2 == 0;

  printf("%d\n",res);

  return 0;
}
