#include <stdio.h>
#include <stdlib.h>

int verif(char* str) {
  int i,nbl;
  for (i = 0; i < 9; i++)
    {
      nbl = i;
      while (nbl < 9)
	{
	  if (str[i] == str[nbl+1])
	    return 1;                    
	}
    }
  return 0;

}

int main (int argc,char* argv[]) {
  
  int tab[9][9]={4,1,5,6,3,8,9,7,2,
		 3,6,2,4,7,9,1,8,5,
		 7,8,9,2,1,5,3,6,4,
		 9,2,6,3,4,1,7,5,8,
		 1,3,8,7,5,6,4,2,9,
		 5,7,4,9,8,2,6,3,1,
		 2,5,7,1,6,4,8,9,3,
		 8,4,3,5,9,7,2,1,6,
		 6,9,1,8,2,3,5,4,7};
  char* tmp;
  int i,j,k,temp;
  for(i=0;i<9;i++) {
    for(j=0;j<9;j++)
      tmp[j]=tab[i][j];

    temp=verif(tmp);

    if(temp==1){
      printf("0/n");
      k++;
    }
  }

  for(j=0;j<9;j++) {
    for(i=0;i<9;i++)
      tmp[i]=tab[i][j];
    
    temp=verif(tmp);
    
    if(temp==1){
      printf("0/n");
      k++;
    }
  }

  if(k==0)
    printf("1\n");
  

  /* for (i = 0; i < 9; i++) */
  /*   { */
  /*     for (j = 0; j < 9; j++) */
  /* 	printf("%d ",tab[i][j]); */
  /*     printf("\n"); */
  /*   } */
  
  return 0;
}
