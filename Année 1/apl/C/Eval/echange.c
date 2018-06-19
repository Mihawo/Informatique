#include <stdio.h>
#include <stdlib.h>

void echange (int tab1[], int tab2[], int length)
{
  int i,j,k,l,m,v1,v2,temp;
  k=0;
  l=0;
  
  for (i=0;i<length-1;i++)
    {
      v1=tab1[i]%2;
      v2=tab2[i]%2;

      if (v1==0)
	for (j=i;j<=length-1 || k==0;j++)
	  {
	    v2=tab2[j]%2;
	    
	    if (v2!=0)
	      {
		temp=tab1[i];
		tab1[i]=tab2[j];
		tab2[j]=temp;
		k++;
	      }
	  }

      if (v2!=0)
	for (m=i;m<=length-1 || l==0;m++)
	  {
	    v1=tab2[m]%2;
	    
	    if (v1==0)
	      {
		temp=tab2[i];
		tab2[i]=tab1[m];
		tab1[m]=temp;
		l++;
	      }
	  }

    }	
}

int main ()
{
  int i,j;
  int tab1[50] = {1,2,5,7};
  int tab2[50] = {3,0,2,8};

  int length=4;

  echange(tab1,tab2,length);

  for(i=0;i<length;i++)
    printf("%d",tab1[i]);

  printf("\n");
  
  for(j=0;j<length;j++)
    printf("%d",tab2[j]);

  printf("\n");

  return 0;
}
