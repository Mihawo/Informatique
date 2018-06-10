#include <stdio.h>

int main(int argc, char* argv[]) {
   double moy;
   scanf("%lf", &moy);
   if (moy < 8)
      printf("Recalé\n");

   if (moy >= 8 && moy < 10)
      printf("Rattrapage\n");  
   
   if (moy >= 10 && moy < 12)
      printf("Mention passable\n");
      
   if (moy >= 12 && moy < 14)
      printf("Mention assez bien\n");

   if (moy >= 14 && moy < 16)
      printf("Mention bien\n");

   if (moy >= 16)
      printf("Mention très bien\n");

   return 0;
}