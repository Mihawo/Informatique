#include <stdio.h>

int puissance (int i,int n) {

  if(n==0)
    return 1;
  if(n==1)
    return i;
  else
    return i*puissance(i,n-1);
}



int megaPower(int x,int y) {

  if (y==0)
    return 1;
  else 
    return puissance(x,megaPower(x,y-1));

}


 
