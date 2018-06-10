import java.util.*;

public class Case {

    private Coord coord;
    private int cout;
    private int estimation;


    public int getCout(){
	return this.cout;
    }

    public int getEstimation(){
	return this.estimation;
    }

    public Coord getCoord(){
	return this.coord;
    }

    public void setCout(int x){
	this.cout=x;
    }

    public void setEstimation(int x){
	this.estimation=x;
    }

    public int heuristique(Case C, Case G){
	int xG=G.getCoord().getX();
	int yG=G.getCoord().getY();

	int xC=C.getCoord().getX();
	int yC=C.getCoord().getY();

	int diffX=Math.abs(xG-xC);
	int diffY=Math.abs(yG-yC);

	int valeur=diffX+diffY+C.getCout();

	return valeur;
    }
}