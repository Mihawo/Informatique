#include <stdio.h>

int main(int argc, char* argv[]) {
   char c;
   int nb = 0;
   
   scanf("%c", &c);
   if (c == 'o')   
      nb++;
      
   scanf("%c", &c);
   if (c == 'i')   
      nb++;

   scanf("%c", &c);
   if (c == 's')   
      nb++;

   scanf("%c", &c);
   if (c == 'e')   
      nb++;

   scanf("%c", &c);
   if (c == 'a')   
      nb++;

   scanf("%c", &c);
   if (c == 'u')   
      nb++;

   printf("%d\n", nb);

   return 0;
}