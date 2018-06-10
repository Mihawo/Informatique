#include <stdlib.h>
#include <stdio.h>

int main(int argc, char* argv[]) {
   int cursize = 50;
   char* str = (char*) malloc(sizeof(char) * cursize);

   char c;
   scanf("%c", &c);
   int i = 0;
   while (c != '\n') {
      str[i] = c;
      ++i;
      if (i == cursize) {
         cursize += 50;
         str = (char*) realloc(str, sizeof(char) * cursize);
      }
      scanf("%c", &c);
   }
   
   int j;
   for (j = i-1; j >= 0; --j) {
      printf("%c", str[j]);
      if ((i - j) % 50 == 0)
         printf("\n");
   }
   if (i % 50 != 0)
      printf("\n");   
}