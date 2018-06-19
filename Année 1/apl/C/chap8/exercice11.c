#include <stdlib.h>

char** split(char* str, char delim, int* nb) {
   *nb = 1;
   char* tmp;
   for (tmp = str; *tmp != '\0'; ++tmp) {
      if (*tmp == delim)
         ++(*nb);
   }
   
   char** res = (char**) malloc(sizeof(char*) * (*nb));
   tmp = str;

   int i, j;   
   for (i = 0; i < (*nb); ++i) {
      int sizestr = 0;
      
      char* tmp2;
      for (tmp2 = tmp; *tmp2 != '\0' && *tmp2 != delim; ++tmp2) 
         sizestr++;
         
      res[i] = (char*) malloc(sizeof(char) * (sizestr + 1));
      
      for (j = 0; j < sizestr; ++j) 
         res[i][j] = tmp[j];
      res[i][j] = '\0';
      
      tmp = tmp2 + 1;
   }
   return res;
}
