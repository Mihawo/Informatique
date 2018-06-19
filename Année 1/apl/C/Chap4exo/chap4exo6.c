#include <stdio.h>
#include <math.h>

int m,c,d,u,n1,n2;

int mil(int n){
  m=n/1000;
  return m;
}

int cen(int n){
  c=(n/100)%10;
  return c;
}

int dix(int n){
  d=(n/10)%10;
  return d;
}

int uni(int n){
  u=n%10;
  return u;
}

int test(int n1, int n2){
  if (mil(n1)==mil(n2) || mil(n1)==cen(n2) || mil(n1)==dix(n2) || mil(n1)==uni(n2) || cen(n1)==mil(n2) || cen(n1)==cen(n2) || cen(n1)==dix(n2) || cen(n1)==uni(n2) || dix(n1)==mil(n2) || dix(n1)==cen(n2) || dix(n1)==dix(n2) || dix(n1)==uni(n2) || uni(n1)==mil(n2) || uni(n1)==cen(n2) || uni(n1)==dix(n2) || uni(n1)==uni(n2))
    return 1;
  else 
    return 0;
}
