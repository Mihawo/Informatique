import java.util.*;

public class Ex5 {
	public static void main (String [] args){
		int [] tab= {1, 2, 3};
		int [] tab1 =	tab;
		
	System.out.println("Nb tab2 :" +tab1[0]);
	System.out.println("Nb tab2 :" +tab1[1]);	
	System.out.println("Nb tab2 :" +tab1[2]);	

	tab1[0]=8;
	tab1[1]=9;	
	
	System.out.println("Nb tab1 :" +tab[0]);
	System.out.println("Nb tab1 :" +tab[1]);	
	System.out.println("Nb tab1 :" +tab[2]);
	
		}	
	}