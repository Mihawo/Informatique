#include <stdio.h>

int main(int argc, char* argv[]) {
   int entier;
   scanf("%d", &entier);
   int unite = entier % 10;
   int centaine = entier / 100;
   int dizaine = (entier / 10) % 10;
   
   int max = unite > dizaine ? unite : dizaine;
   max = max > centaine ? max : centaine;
   
   printf("%d\n", max);

   return 0;
}