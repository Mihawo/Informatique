import java.util.*;

public class Fraction {
	private int num;
	private int den;
	
	public Fraction() {
		num = 0;
		den = 1;
	}
	
	public Fraction(int num, int den) {
		setFrac(num, den);
	}

	public Fraction(Fraction f) {
		this.num = f.num;
		this.den = f.den;
	}
	
	public int getNum() {
		return num;
	}
	
	public int getDen() {
		return den;
	}

	public void setFrac(int num, int den) {
		this.num = num;
		this.den = den;
		if (this.den == 0)
			this.den = 1;
		int p = pgcd(this.num, this.den);
		this.num /= p;
		this.den /= p;
	}

	public static int pgcd(int a, int b) {
		int q0 = a;
		int q1 = b;
		
		int r = q0 % q1;
		int newq = q0 / q1;
		while (r != 0) {
			q0 = q1;
			q1 = r;
			r = q0 % q1;
			newq = q0 / q1;
		}
		return q1;
	}
	
	public boolean equals(Fraction f) {
		return equals(this, f);
	}
	
	public static boolean equals(Fraction f1, Fraction f2) {
		return f1.num == f2.num && f1.den == f2.den;
	}	
}