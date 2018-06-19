#include <stdlib.h>

int length(int entier) {
   int res = 0;
   if (entier == 0)
      return 1;
      
   for (; entier > 0; entier /= 10)
      ++res;

   return res;
}


char* inttostr(int entier) {
   int neg = 0;
   if (entier < 0) {
      neg = 1;
      entier = -entier;
   }
     
   int l = length(entier);
   char* res = (char*) malloc(sizeof(char) * (l + 1 + neg));
   char* tmp = res + l + neg;
   *tmp = '\0';
   tmp--;
   
   if (entier == 0) {
      *tmp = '0';
   } else {
      for (; entier > 0; entier /= 10) {
         *tmp = '0' + entier % 10;
         tmp--;
      }
   }
   
   if (neg)
      *tmp = '-';

   return res;
}