#include <stdio.h>
#include <stdlib.h>


void hex(int n) {
  int i,j,k,l;
  l=n-1;
  for(i=0;i<n;i++)
    {
      for(j=l;j>0;j--)
	{
	  
	  printf(" ");
	}
      for (k=0;k<1+2*i;k++)
	{
	  if(k==j)
	  printf("*");
	  else printf(" ");
	}
      l=l-1;
      printf("*\n");
    }

  for(i=0;i<n;i++)
    {
      for(j=0;j<i;j++)
	{
	  printf(" ");
	}
      printf("* ");
      for(k=0;k<(n*2)-(2*i)-2;k++)
	{
	  if(k==(n*2)-(2*i)-2-1)
	    printf(" *\n");
	  else printf(" ");
	}
    }
  printf("*\n");

}



int main ()
{

  int n;
  scanf("%d",&n);

  hex(n);
}
