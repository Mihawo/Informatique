#include <stdio.h>

int main(int argc, char* argv[]) {
   int entier;
   scanf("%d", &entier);
   
   if (entier == 0)   
      printf("zéro\n");
   else if (entier == 1)
      printf("un\n");   
   else if (entier == 2)
      printf("deux\n");   
   else if (entier == 3)
      printf("trois\n");   
   else if (entier == 4)
      printf("quatre\n");   
   else if (entier == 5)
      printf("cinq\n");   
   else if (entier == 6)
      printf("six\n");   
   else if (entier == 7)
      printf("sept\n");   
   else if (entier == 8)
      printf("huit\n");   
   else
      printf("neuf\n");   

   return 0;
}