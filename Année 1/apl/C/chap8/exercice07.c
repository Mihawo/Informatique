int strtoint(char* str, int* error) {        
   int res = 0;

   if (*str < '0' || *str > '9') {
      *error = 1;
      return 0;
   }


   for (; *str != '\0' && *str >= '0' && *str <= '9'; ++str) {
      int tmp = *str - '0';
      res *= 10;
      res += tmp;
   }

   *error = 0;
   return res;
}


int main() {
    char* r = "469684d098";
    int error;
    printf("%d\n", strtoint(r, &error));
    
    return 0;
}