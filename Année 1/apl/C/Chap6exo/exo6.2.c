#include <stdio.h>

int count(int tab [], int taille) {

  int i,j;
  j=0;
  for(i=0;i<taille;i++)
    {
      if (tab[i]!=0)
      {
	j=j+1;
      }
    }

  return j;
}
