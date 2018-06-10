#include <stdio.h>


int main () {
  int i,j,k,l,n;
  scanf("%d",&n);
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
	  printf("/");
	  else printf(" ");
	}
      l=l-1;
      printf("\\\n");
    }

  for(i=0;i<n;i++)
    {
      for(j=0;j<i;j++)
	{
	  printf(" ");
	} 
      printf("\\");
      for(k=0;k<(i*2)-2-(2*n);k++)
	{
	  if(k==(i*2)-2-(2*n))
	    printf(" /\n");
	  else printf(" ");
	}
    }
  printf("/\n");

  return 0;

}



