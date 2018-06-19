#include <stdio.h>

int main(int argc, char* argv[]) {
   int roi1, roi2;
   int p1, p2;
   char c;

   scanf("%d", &roi1);
   scanf("%d", &roi2);
      
   scanf("%c", &c);
   scanf("%c", &c);   

   scanf("%d", &p1);
   scanf("%d", &p2);

   int echec = 0;

   int diff1 = roi1 - p1;
   int diff2 = roi2 - p2;   

   diff1 = diff1 < 0 ? -diff1 : diff1;
   diff2 = diff2 < 0 ? -diff2 : diff2;   

   if (c == 'R')
      echec = diff1 <= 1 && diff2 <= 1;

   if (c == 'D')
      echec = diff1 == 0 || diff2 == 0 || diff1 == diff2;

   if (c == 'T')
      echec = diff1 == 0 || diff2 == 0;
   
   if (c == 'F')
      echec = diff1 == diff2;

   if (c == 'C')
      echec = diff1 == 1 && diff2 == 2 || diff1 == 2 && diff2 == 1;
   
   if (echec)
      printf("Echec\n");
   else
      printf("Pas Echec\n");
      
   return 0;
}