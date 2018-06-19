#include <stdio.h>

int plus(double a,int n) {

  int i;
  if (n>=0)
    {
      for(i=0; i<n; i++)
	{
	  a=a+1;
	}
      return a;
    }

  else if (n<0)
    {
      for(i=0; i>n; i--)
	{
	  a=a-1;
	}
      return a;
    }
}
