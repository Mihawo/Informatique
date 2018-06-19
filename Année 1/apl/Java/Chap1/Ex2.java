import java.util.Scanner;

public class Ex2 {
	public static void main (String[] args){
		Scanner	 sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un entier :");
		int ent1 = sc.nextInt();		
		
		System.out.println("Veuillez saisir un entier :");	
		int ent2 = sc.nextInt();	
		
		System.out.println("Veuillez saisir un entier :");	
		int ent3 = sc.nextInt();	
		
		System.out.println("Veuillez saisir un entier :");	
		int ent4 = sc.nextInt();	
		
		System.out.println("Veuillez saisir un entier :");	
		int ent5 = sc.nextInt();	
				
		if (ent1>=ent2 && ent1>=ent3 && ent1>=ent4 && ent1>=ent5)
		System.out.println("Entier le plus grand: " + ent1);
		
		if (ent2>=ent1 && ent2>=ent3 && ent2>=ent4 && ent2>=ent5)
		System.out.println("Entier le plus grand: " + ent2);
		
		if (ent3>=ent1 && ent3>=ent2 && ent3>=ent4 && ent3>=ent5)
		System.out.println("Entier le plus grand: " + ent3);
		
		if (ent4>=ent1 && ent4>=ent1 && ent4>=ent3 && ent4>=ent5)
		System.out.println("Entier le plus grand: " + ent4);
		
		if (ent5>=ent1 && ent5>=ent2 && ent5>=ent3 && ent5>=ent4)
		System.out.println("Entier le plus grand: " + ent5);
		}
	}