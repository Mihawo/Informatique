#include <stdio.h>

int division(int a,int n) {

  int compteur=0;
  int flag=0;
  if (a<0) {
    a= -a;
    flag++;
  }
  if(n<0) {
    n= -n;
    flag--;
  }

  while (a>0) {
    a-=n;
    compteur++;
  }

  if (!(a==0))
    compteur--;

  if (flag!=0)
    return -compteur;
  else 
    return compteur;
}

int modulo (int a,int n) {

  int res=a - (division(a,n))*n;

    }
