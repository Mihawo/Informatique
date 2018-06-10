#include <stdio.h>

int main () {

  int a,b,c;
  scanf("%lf %lf",&a,&b);
  

  if (a > b && a > c)
    printf("%d\n",a);
  else if (b > a && b > c)
    printf("%d\n",b);
  else if (c > a && c > b)
    printf("%d\n",c);

	 return 0;
}
