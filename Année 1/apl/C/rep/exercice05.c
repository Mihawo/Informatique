#include <stdio.h>

int main(int argc, char* argv[]) {
   int i1, i2, i3;
   scanf("%d", &i1);
   scanf("%d", &i2);
   scanf("%d", &i3);

   if (i1 >= i2) {
      if (i1 >= i3) {
         //i1 le plus grand
         if (i2 >= i3)
            printf("%d %d %d\n", i3, i2, i1);
         else
            printf("%d %d %d\n", i2, i3, i1);
      }
      else {
         //i3 le plus grand      
         printf("%d %d %d\n", i2, i1, i3);
      }
      
   } else {   
      if (i2 >= i3) {
         //i2 le plus grand
         if (i1 >= i3)
            printf("%d %d %d\n", i3, i1, i2);
         else
            printf("%d %d %d\n", i1, i3, i2);
      }
      else
         //i3 le plus grand
         printf("%d %d %d\n", i1, i2, i3);
   }

   return 0;
}