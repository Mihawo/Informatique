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

int max8 (int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8) {
  return max2(max4(a1,a2,a3,a4),max4(a5,a6,a7,a8));
}
