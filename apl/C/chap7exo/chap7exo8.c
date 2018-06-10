#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void) {
  int* p;

  if (time(NULL)%2) 
    {
      int x=59;
      p=&x;
    }
  else 
    {
      int y=31;
      p=&y;
    }

  printf("%d\n",*p);

  return 0;
}

//C'est interdit de faire sa
