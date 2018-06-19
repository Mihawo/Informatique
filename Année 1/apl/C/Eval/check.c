#include <stdio.h>
#include <stdlib.h>

int check (int tab[], int length)
{
  int i,j;
  for(i=0;i<=length-1;i++)
    {
      if (tab[i]>=0 && tab[i]<=length-1)
	{
	  for(j=0;j<=i-1;j++)
	    {
	      if(tab[i]==tab[j])
		return 0;
	    }
	}
    }
  return 1;
}


int main ()
{

  int tab[100]={2,-5,4,11,0,1,3,6,9,10,7,8};
  int length=12;

  int res = check(tab,length);

  printf("%d\n",res);

  return 0;

}
