#include <stdio.h>

void inverse (int tab[], int taille) {
  
  int i,temp,var;
  for (i=0;i<taille/2;i++)
    {
      temp=tab[i];
      tab[i]=tab[taille-i-1];
      tab[taille-i-1]=temp;
    }
}
