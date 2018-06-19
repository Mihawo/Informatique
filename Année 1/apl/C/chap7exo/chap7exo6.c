#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int* oee() {

  srand(time(NULL));

  int temp=rand();

  return &temp;
}

int main() {

  printf("%d\n",*oee());

  return 0;
}

//C'est interdit de faire sa
