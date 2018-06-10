#include <stdio.h>

int sumtab(int tab[],int taille) {

  if(!taille)
    return 0;
  else if (tab[taille-1]<0)
    return sumtab(tab,taille-1);
  else
    return tab[taille-1]+sumtab(tab,taille-1);
}
