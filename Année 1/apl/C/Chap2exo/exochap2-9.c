#include <stdio.h>

int main() {
 
  int res; 
  char c1,c2,c3,
  scanf("%d %d %d",&n1,&n2,&n3);

  res= n1>8 && n2>8 && n3>8 && (n1+n2+n3)/3.0 >= 10;

  printf("%d\n",res);

  return 0;
}
