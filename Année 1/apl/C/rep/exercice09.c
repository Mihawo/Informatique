#include <stdio.h>

int main(int argc, char* argv[]) {
   int n;

   scanf("%d", &n);
   
   if (n % 5 == 0 && n % 7 == 0)
      printf("FizzBuzz\n");
   else if (n % 5 == 0)
      printf("Fizz\n");
   else if (n % 7 == 0)
      printf("Buzz\n");
                  
   return 0;
}