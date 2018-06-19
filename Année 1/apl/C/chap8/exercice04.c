int startwith(char* str1, char* str2) {
   for (; *str1 != '\0' && *str2 != '\0'; ++str1, ++str2) {
      if (*str1 != *str2)
         return 0;
   }
   
   if (*str2 != '\0')
      return 0;
      
   return 1;
}

int contains(char* str1, char* str2) {  
   for (; *str1 != '\0'; ++str1) {
      if (startwith(str1, str2))
         return 1;
   }
         
   return 0;
}
