#include <stdio.h>
#include <stdlib.h>

int strlength(char* str) {
  int i = 0;
  for (; *str != '\0'; ++str)
    ++i;
  return i;
}

void tri (char** tab, int size) {
  int i,j,k,tailleC,tailleC2;
  char* tmp,str1,str2;  

  for(i=0;i<size;i++){
    tailleC=strlength(tab[i]);
    str1=*tab[i];
    for(j=0;j<size;j++){
      tailleC2=strlength(tab[j]);
      str2=*tab[j];
      if(str1<str2)
	{
	  tmp = tab[i];
	  tab[i] = tab[j];
	  tab[j] = tmp;
	}
    }
  }
}

int main (int argc,char* argv[]) {

  char* tab[6]={"hola","salut","hello","salami","buongiorno","salam"};
  int i,size=6;

  /* for(i=0;i<5;i++) */
  /*   scanf("%s",tab[i]); */

  tri(tab,size);

  for(i=0;i<6;i++)
    printf("%s\n",tab[i]);

  return 0;
	  

}
