#include <stdio.h>

int main () {

  int a,b,c,pre,deu,tro;
  scanf("%d %d %d",&a,&b,&c);
  
  if (a > b && a > c) {
    pre=a;
    if (b>c) {
      deu=b;
      tro=c; }
    else {
      deu=c;
      tro=b; }
  }

  if (b>a && b>c) {
    pre=b;
    if (a>c) {
      deu=a;
      tro=c; }
    else {
      deu=c;
      tro=a; }
  }

  if (c>a && c>b) {
    pre=c;
    if (b>a) {
      deu=b;
      tro=a; }
    else {
      deu=a;
      tro=b; }
  }

  printf("%d %d %d\n",tro,deu,pre);

	 return 0;
}
