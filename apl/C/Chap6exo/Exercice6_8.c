/* Exercice 6.8 du 12 Octobre */

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

void sort(int tab[], int taille){
  
  int i,j,c;
  for(i=0;i<taille;i++) {
    c = i;
    for(j=i-1;j>=0;j--) {
      if (tab[c]<=tab[j]) {
	move(tab,taille,j,c);
	c--;
      }
    }
  }
}
    

	
    
      
	
	
      
      
    

  

  

    
   
  
  
