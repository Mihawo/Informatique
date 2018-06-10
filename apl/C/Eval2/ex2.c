#include <stdio.h>
#include <stdlib.h>

int strlength(char* str) {
	int i = 0;
	for (; *str != '\0'; ++str)
		++i;
	return i;
}

int verif(char* str1,char* str2){
  int tailleC,tailleC2;
  
  tailleC=strlength(str1);
  tailleC2=strlength(str2);

  if(*str1==*str2) {
    if(*str1=='\0' && tailleC==tailleC2)
      return 1;
    if(*str1!='\0')
      return verif(str1+1,str2+1);
  }
  else 
    return 0;
}

int match(char* str, char** tab, int size) {
  int i,res;

  for(i=0;i<size;i++){
    res=verif(str,tab[i]);
    if (res==1)
      return res;
  }

  return res;
}

int main (int argc,char* argv[]) {

  char* str;
  char* tab[]={"feeef","krrrke"};
  int size=2,res,i;

  scanf("%c\n",&str);
  res=match(str,tab,size);

  printf("%d\n",res);

}
