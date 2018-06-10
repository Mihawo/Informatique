#include <stdio.h>

double puissance (double a, int n) {
  int i,z;
  double res=1;
  if (n<0) {
    n=-n;
    z=1; }
  for (i=0;i<n;i++) 
    res=res*a; 
  if (z==1) 
    res=(1/res);
  return res;
}


int main() {
  int a,b;
  double c;
  scanf("%d %d",&a,&b);
  c=puissance(a,b);
  printf("%lf",c);
  return 0;
    }
