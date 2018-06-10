import java.util.*;

public class Ex3 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Mot: ");
		String mot=sc.next();
		String first;
		String last;
		
		first=mot;		
		last=mot;
		
		while(!mot.equals ("Fin") ){
			System.out.println("Mot: ");
			if(mot.compareTo(first)<0)
				first=mot;
			if(mot.compareTo(last)>0)
				last=mot;
			mot=sc.next();
			}
		System.out.println("Plus grand mot :" +first);
		System.out.println("Plus petit mot :" +last);
			}
		}
			