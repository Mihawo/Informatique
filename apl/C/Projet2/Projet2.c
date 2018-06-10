#include <stdio.h>
int main () {

  //Dés des joueurs
  int x1,y1,z1,x2,y2,z2; 

  //Pour ordre croissant
  int pre1,deu1,tro1,pre2,deu2,tro2;

  scanf("%d %d %d %d %d %d",&x1,&y1,&z1,&x2,&y2,&z2);

  //Ordre croissant du joueur1
 if (x1 > y1 && x1 > z1) {
    pre1=x1;
    if (y1>z1) {
      deu1=y1;
      tro1=z1; }
    else {
      deu1=z1;
      tro1=y1; }
  }

  if (y1>x1 && y1>z1) {
    pre1=y1;
    if (x1>z1) {
      deu1=x1;
      tro1=z1; }
    else {
      deu1=z1;
      tro1=x1; }
  }

  if (z1>x1 && z1>y1) {
    pre1=z1;
    if (y1>x1) {
      deu1=y1;
      tro1=x1; }
    else {
      deu1=x1;
      tro1=y1; }
  }

  //Ordre croissant du joueur2
 if (x2 > y2 && x2 > z2) {
    pre2=x2;
    if (y2>z2) {
      deu2=y2;
      tro2=z2; }
    else {
      deu2=z2;
      tro2=y2; }
  }

  if (y2>x2 && y2>z2) {
    pre2=y2;
    if (x2>z2) {
      deu2=x2;
      tro2=z2; }
    else {
      deu2=z2;
      tro2=x2; }
  }

  if (z2>x2 && z2>y2) {
    pre2=z2;
    if (y2>x2) {
      deu2=y2;
      tro2=x2; }
    else {
      deu2=x2;
      tro2=y2; }
  }

  // Combinaison spécial Suite
  if (deu1==pre1+1 && tro1==deu1+1)
    { if (deu2==pre2+1 && tro2==deu2+1 && tro1>tro2)
	printf("Player1 wins\n");
	else if (deu2==pre2+1 && tro2==deu2+1 && tro1==tro2)
	  printf("Draw\n");
	else printf("Player1 wins\n"); }

  return 0;
}
