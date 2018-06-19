#include <stdio.h>

int main() {
  printf("Veuillez rentrer un caractère alphanumérique.\n");
  char a;
  scanf("%c",&a);
  while ( !((a>='0'&&a<='9')||(a>='a'&&a<='z')||(a>='A'&&a<='Z')))
    {
      printf("Veuillez rentrer un caractère alphanumérique.\n");
      scanf(" %c",&a);
    }
  return 0;
}
