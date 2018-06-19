/* Exercice 6.7 du 12 Octobre */

#include <stdio.h>

void move(int tab[], int taille, int a, int b){
  
  int i,t;
  if (a<=b && b<=taille){
    t = tab[b];
    for (i=b;i>a;i--)
      tab[i]=tab[i-1];
    tab[a] = t;
  }
}
int main () {
  
  int i;
  int tab[8] = {3,2,1,10,6,7,6,2};
  sort(tab,8);
  for(i=0;i<8;i++)
    printf("%d ",tab[i]);
  printf("\n");
  return 0;
}
      
      
void sort(int tab[], int taille){
  
  int i,j,c;
  c = 0;
  for(i=0;i<taille;i++) {
    if(tab[i]<0) {
      move(tab,taille,c,i);
      c++;
    }
  }
}
    

	
    
      
	
	
      
      
    

  

  

    
   
  
  
