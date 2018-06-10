#include <stdio.h>

int main () {

  float f;
  double d;
  long double ld;
  char c;
  short int si;
  int i;
  long unsigned int lui;

  printf("%p %p %p %p %p %p %p\n",&f,&d,&ld,&c,&si,&i,&lui);
    return 0;
}
