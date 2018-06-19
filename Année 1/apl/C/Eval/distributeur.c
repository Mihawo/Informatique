#include <stdio.h>


int main(int argc, char* argv[])
{

  double eur;
  char ch;
  int rend;
  scanf("%lf %c",&eur,&ch);

  eur=eur*100;
  
  if (ch=='c')
    {
      int prix=115;
      
      if (eur<prix)
	printf("Il manque %lf euros.\n",eur=(prix-eur)/100);
      
      else if (eur>=prix)
	{
	  rend=eur-prix;
	  int i,j,k,l,m,n,o,p;
	  for(i=0;rend>=200;i++)
	    {
	      rend=rend-200;
	    }

	  for(j=0;rend>=100;j++)
	    {
	      rend=rend-100;
	    }

	  for(k=0;rend>=50;k++)
	    {
	      rend=rend-50;
	    }

	  for(l=0;rend>=20;l++)
	    {
	      rend=rend-20;
	    }

	  for(m=0;rend>=10;m++)
	    {
	      rend=rend-10;
	    }

	  for(n=0;rend>=5;n++)
	    {
	      rend=rend-5;
	    }

	  for(o=0;rend>=2;o++)
	    {
	      rend=rend-2;
	    }

	  for(p=0;rend>0;p++)
	    {
	      rend=rend-1;
	    }

	  printf("La machine rend:\n2 euros: %d\n1 euros %d\n50 centimes: %d\n20 centimes: %d\n10 centimes: %d\n5 centimes: %d\n2 centimes: %d\n1 centime: %d\n",i,j,k,l,m,n,o,p);
	  
	}
    }
  
  else if (ch=='d')
    {
      int prix=187;
      
      if (eur<prix)
	printf("Il manque %lf euros.\n",eur=(prix-eur)/100);
      
      else if (eur>=prix)
	{
	  rend=eur-prix;
	  int i1,j1,k1,l1,m1,n1,o1,p1;
	  for(i1=0;rend>=200;i1++)
	    {
	      rend=rend-200;
	    }

	  for(j1=0;rend>=100;j1++)
	    {
	      rend=rend-100;
	    }

	  for(k1=0;rend>=50;k1++)
	    {
	      rend=rend-50;
	    }

	  for(l1=0;rend>=20;l1++)
	    {
	      rend=rend-20;
	    }

	  for(m1=0;rend>=10;m1++)
	    {
	      rend=rend-10;
	    }

	  for(n1=0;rend>=5;n1++)
	    {
	      rend=rend-5;
	    }

	  for(o1=0;rend>=2;o1++)
	    {
	      rend=rend-2;
	    }

	  for(p1=0;rend>0;p1++)
	    {
	      rend=rend-1;
	    }

	  printf("La machine rend:\n2 euros: %d\n1 euros %d\n50 centimes: %d\n20 centimes: %d\n10 centimes: %d\n5 centimes: %d\n2 centimes: %d\n1 centime: %d\n",i1,j1,k1,l1,m1,n1,o1,p1);
	  
	}
    }

  else if (ch=='g')
    {
      int prix=221;
      
      if (eur<prix)
	printf("Il manque %lf euros.\n",eur=(prix-eur)/100);

      else if (eur>=prix)
	{
	  rend=eur-prix;
	  int i2,j2,k2,l2,m2,n2,o2,p2;
	  for(i2=0;rend>=200;i2++)
	    {
	      rend=rend-200;
	    }

	  for(j2=0;rend>=100;j2++)
	    {
	      rend=rend-100;
	    }

	  for(k2=0;rend>=50;k2++)
	    {
	      rend=rend-50;
	    }

	  for(l2=0;rend>=20;l2++)
	    {
	      rend=rend-20;
	    }

	  for(m2=0;rend>=10;m2++)
	    {
	      rend=rend-10;
	    }

	  for(n2=0;rend>=5;n2++)
	    {
	      rend=rend-5;
	    }

	  for(o2=0;rend>=2;o2++)
	    {
	      rend=rend-2;
	    }

	  for(p2=0;rend>0;p2++)
	    {
	      rend=rend-1;
	    }

	  printf("La machine rend:\n2 euros: %d\n1 euros %d\n50 centimes: %d\n20 centimes: %d\n10 centimes: %d\n5 centimes: %d\n2 centimes: %d\n1 centime: %d\n",i2,j2,k2,l2,m2,n2,o2,p2);
	  
	}
    }

  return 0;
}
