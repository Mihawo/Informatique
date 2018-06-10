#include <stdio.h>

int main () {

  char a,b,c,d,e,f;

  int res;

  scanf("%c %c %c %c %c %c",&a,&b,&c,&d,&e,&f);

  res = 0;

  if (a == 'o')
    res=res+1;

  if (b == 'i')
    res=res+1;

  if (c=='s')
    res=res+1;

  if (d=='e')
    res=res+1;

  if (e=='a')
    res=res+1;

  if (f=='u')
    res=res+1;

  printf("%d\n",res);

	 return 0;
}
