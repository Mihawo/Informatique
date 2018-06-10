#include <stdio.h>
#include <math.h>

double gaussienne(double x,double u, double e) {
  double racine = sqrt(e*2*M_PI);
  double expo = exp(-((x-u)*(x-u))/(2*e*e));
  double esperance = (1/racine)*expo;
  return esperance;
}
