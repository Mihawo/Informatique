#include <stdio.h>

int main () {

  int a,cen,dix,uni;
  scanf("%d",&a);
  cen=a/100;
  dix=(a/10)%10;
    uni=a%10;

    if (cen>dix && cen>=uni)
      printf("%d\n",cen);

    if (dix>cen && dix>uni)
      printf("%d\n",dix);

    if (uni>cen && uni>dix)
      printf("%d\n",uni);

	 return 0;
}
