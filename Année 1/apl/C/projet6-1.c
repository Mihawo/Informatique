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

int tabstrlength(char** tab)
{
  int i=0;

  while (tab[i][0]!='\0')
    i++;

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
	 //printf("%d-%c\n",j,str[i]);
	 res[j]=',';
	 ++j;
	 ++i;
       }
     else if ((str[i]>='0' && str[i]<='9') || (str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z'))
       {
	 //printf("%d-%c\n",j,str[i]);
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

/*void subs(char *regle[100],char* str,char* res,int fois) {
  int i,j,k,l,m,n,o;
  i=0;
  l=0;
  int taille=strlength(str);
  while(str[i]!='\0')
    {
      res[l]=str[i];

      for(j=0;j<=(int)regle[0][0];j+=2)
	if(res[l]==regle[j][0])
	  {
	    m=j+1;
	    for(k=0;regle[m][k]!='\0';k++)
	      {
		//res=realloc(res,sizeof(char*)*(*regle[m+1]+taille-1));
		res[l]=*regle[m];
		l++;
	      }
	    
	    int taille2=strlength(regle[m]);
	    for(o=0;o<=taille2;o++)
	      i++;
	  }
      i++;
      l++;
    }
    }*/

int main (int argc,char* argv[]) {

  char delim=',';

  int nb,taille,i;

  int fois=argv[3]-48;

  char* chaine=argv[1];
  char* mot=argv[2];
  char* res=malloc(sizeof(char)*300);

  taille=strlength(chaine);
  char* dors=enleve(chaine);
  char** regle=split(dors,delim,&nb);

  int longueur=tabstrlength(regle);

  printf("%d\n",fois);

  /*for(i=0; i<nb;i++)
  printf("%d-\"%s\"\n",i+1,regle[i]);

  printf("%s %s\n",mot,res);
    subs(regle,mot,res);

    printf("%s\n",res);*/
  return 0;
}
