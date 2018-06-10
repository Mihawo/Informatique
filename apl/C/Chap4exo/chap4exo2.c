#include <stdio.h>
#include <math.h>

int max2 (int v1, int v2){
  if(v1>v2)
   
    return v1;
  else return v2;
}

int max4 (int ent1, int ent2, int ent3, int ent4){
  return max2(max2(ent1,ent2),max2(ent3,ent4));
}

