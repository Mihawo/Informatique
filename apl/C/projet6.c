#include <stdio.h>
#include <stdlib.h>
    
int strlength(char* str)
{
  int i;
  i=0;

  while (str[i]!='\0')
    {
      i++;
    }

  return i;
}

char* enleve (char* str) {

  int i=0;
  int j=0;
  char* res;
 while (str[i]!='\0')
   {
     if(str[i]=='>')
       {
	 printf("%d-%c\n",j,str[i]);
	 res[j]=',';
	 ++j;
	 ++i;
       }
     else if ((str[i]>='0' && str[i]<='9') || (str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z'))
       {
	 printf("%d-%c\n",j,str[i]);
	 res[j]=str[i];
	 ++j;
	 ++i;
       }
     else if (str[i]==',')
       {
	 res[j]=str[i];
	 ++j;
	 ++i;
       }
     else 
       ++i;
   }
 res[j]='\0';

 return res;
}

char** split(char* str, char delim, int* nb) {
  *nb = 1;
  char* tmp;
  
  for (tmp = str; *tmp != '\0'; ++tmp) {
    if (*tmp == delim)
      ++(*nb);  
  }
  
  char** res = (char**) malloc(sizeof(char*) * (*nb));
  tmp = str;
  
  int i, j;   
  for (i = 0; i < (*nb); ++i) {
    int sizestr = 0;
    
    char* tmp2;
    for (tmp2 = tmp; *tmp2 != '\0' && *tmp2 != delim; ++tmp2) 
      sizestr++;
    
    res[i] = (char*) malloc(sizeof(char) * (sizestr + 1));
      
    for (j = 0; j < sizestr; ++j) 
      res[i][j] = tmp[j];
    res[i][j] = '\0';
    
    tmp = tmp2 + 1;
  } 
  return res;
}

char* subs(char** regle,char* mot,int moot, int fois) {
  int i=0,j,k,l,m,n,o,c;
  char* res= (char*)malloc(sizeof(char)*300);

  while(mot[i]!='\0')
    {
      res[c]=mot[i];
      i++;
    }

  return res;
}

int main (int argc,char* argv[]) {

  char delim;
  int nb,taille,taille2,i;
  char* chaine=argv[1];
  char* mot=argv[2];
  int fois=*argv[3]-48;
  delim=',';
  taille=strlength(chaine);
  taille2=strlength(mot);

  char* dors=enleve(chaine);
  
  char** regle=split(dors,delim,&nb);

for(i=0; i<nb;i++)
    printf("%d-\"%s\"\n",i+1,regle[i]);

  char* res=subs(regle,mot,taille2,fois);

  printf("%s\n",argv[2]);

  return 0;
}
