#include <stdio.h>



int isint (char* str) {


  if(str[0]=='\0')
    return 1;
  else if(*str>='0' && *str<='9')
    return isint(str+1);
  else 
    return 0;

}

int main(int argc,char* argv[]) {

  char* str=argv[1];
  
  int res=isint(str);
  
  printf("%d\n",res);

  return 0;

}
