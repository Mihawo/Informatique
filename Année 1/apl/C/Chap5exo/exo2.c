#include <stdio.h>

double mult(double a, int n) {
  int i;
  double res=0;
  if (n>0) {
    for (i=0;i<n;i++) { 
      res=res+a; 
    }
      return res;
  }
  else if (n<0) 
    for (i=0;i>n;i--) {
      res=res+a;
    }
  return -res;
}

/*
int main() {
  int a,b;
  double c;
  scanf("%d %d",&a,&b);
  c=puissance(a,b);
  printf("%lf",c);
  return 0;
    }*/
