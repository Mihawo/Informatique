/* Exercice 6.6 du 12 Octobre */

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
    
    
	
    
      
	
	
      
      
    

  

  

    
   
  
  
