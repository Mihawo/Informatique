#include <stdio.h>

int main() {
 
  int res; 
  char c1,c2,c3;
  scanf("%c %c %c", &c1, &c2, &c3);

  res = c1==c2 && c1!=c3 || c2==c3 && c2!=c1 || c3 == c1 && c1!=c2;

  printf("%d\n",res);

  return 0;
}
