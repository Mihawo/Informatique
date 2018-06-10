#include <stdio.h>

int taille (int nb)
{
  int i;
  int tab[100];

  for(i=0;tab[i]!='\0';i++)
    {
      if (nb>=0 && nb<=9)
	{
	  tab[i]=nb;
	}
    }
  return i;
}


int main ()
{
  int nb;
  scanf("%d",&nb);

  printf("%d\n",taille(nb));

}
