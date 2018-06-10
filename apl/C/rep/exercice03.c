#include <stdio.h>

int f3() {
   int entier;
   scanf("%d", &entier);

   int proche1 = (entier / 3)*3;
   int proche2 = (entier / 3 + 1)*3;
   
   if (entier - proche1 <= proche2 - entier)
      printf("%d\n", proche1);
   else
      printf("%d\n", proche2);   
    
   return 0;
}
