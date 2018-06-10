#include <stdio.h>

int main() {
 
  char v1,v2;
  int res; 
  scanf("%c %c", &v1,&v2);

  res = v1>= "0" && v1<= "9";

  printf("%d\n",res);

  return 0;
}
