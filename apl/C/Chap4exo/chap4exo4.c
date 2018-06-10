#include <stdio.h>
#include <math.h>

int xor (int a, int b) {

 if (a==1 || b==1)
   {
     if (a==1 && b==1)
       return 0;
     else return 1;
   }
  else return 0;
}
