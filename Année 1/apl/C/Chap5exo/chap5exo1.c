#include <stdio.h>

double puissance(double a,int n) {
  double res=1;
  int i;
  

  if(n>0)
    {
      for (i=0;i<n;i++)
	{
	  res*=a; //res=res*a
	}
      return res;
    }

  if(n<0)
    {
      for (i=0;i<-n;i++) 
	{
	  res*=a; //res=res*a
	}
      return -res;
    }
}
  
int main () {
  double a;
  int n;

  scanf("%lf %d",&a,&n);

  printf("%lf\n",puissance(a,n));

  return 0;
}
