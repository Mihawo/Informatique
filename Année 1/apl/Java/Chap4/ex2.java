class Cool {
    Cool(int i) {
	System.out.println("constructeur de Cool");
    }
}
class Raoul extends Cool {
    Raoul() {
	super(2);
	System.out.println("constructeur de Raoul");
    }
}

class ex2{
    public static void main(String[] args){
	new Cool(2);
	System.out.println("=============================");
	new Raoul();
    }
}