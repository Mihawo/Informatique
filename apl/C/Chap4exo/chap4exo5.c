#include <stdio.h>
#include <math.h>

int xor (int a, int b) {

 if (a==1 || b==1)
   if (a==1 && b==1)
     return 0;
   else 
     return 1;
}

int megaxor (int a, int b, int c, int d){
  return xor(xor(a,b),xor(c,d));
}
