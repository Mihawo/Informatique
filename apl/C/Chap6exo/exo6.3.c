#include <stdio.h>

int max(int tab[], int taille) {
  
  int i,j,max;
  max=tab[0];
  for(i=0;i<taille;i++)
    {
      if(tab[i]>max)
	max=tab[i];
    }
  return max;
}
