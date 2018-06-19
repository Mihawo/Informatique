#include <stdio.h>

int main(int argc, char* argv[]) {
   int a, b;
   scanf("%d %d", &a, &b);
   
   if (a != 0) {
      printf("%lf\n", -(double)b/(double)a);
   } else if (b == 0) {
      printf("Tout x est solution\n");
   } else
      printf("Pas de solution\n");
                              
   return 0;
}