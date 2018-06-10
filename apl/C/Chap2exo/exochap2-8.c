#include <stdio.h>

int main() {
 
  int n,res; 
  scanf("%d", &n);

  res = n%400==0 || n%4==0 && n%100!=0;

  printf("%d\n",res);

  return 0;
}
