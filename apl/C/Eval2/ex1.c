#include <stdio.h>
#include <stdlib.h>

int verif(int nb, int i,int m){
  if (nb%i==0)
    m++;
  if(i>nb)
    return m;
  else
    {
      i++;
    return verif(nb,i,m);
    }
  }

int premier(int nb) {
  int i=1,n,m=0;

  if (nb==0 || nb==1)
    return 0;

  n=verif(nb,i,m);
  /* printf("%d\n",n); */
  if(n==2)
    return 1;

  else
    return 0;

}
int main (int argc,char* argv[]) {

  int prem,res;
  scanf("%d",&prem);
  /* printf("%d\n",prem); */
  res=premier(prem);
  printf("%d\n",res);
  return 0;

}
