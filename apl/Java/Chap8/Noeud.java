import java.util.*;
import java.swing.*;

public class Noeud implements Comparable<Noeud>{

    private int nbOc;
    private byte octet;
    private Noeud ng;
    private Noeud nd;

    public Noeud(int nbr, byte oct){
	this.nbOc=nbr;
	this.octet=oct;
    }

    public int getNbOc(){
	return nbOc;
    }

    public byte getOctet(){
	return octet;
    }

    public Noeud getNg(){
	return ng;
    }

    public Noeud getNd(){
	return nd;
    }

    @Override
    public int compareTo(Noeud n){
	if(this.getNbOc()<n.getNbOc())
	    return -1;
	else if (this.getNbOc()==n.getNbOc())
	    return 0;
	else if(this.getNbOc()>n.getNbOc())
	    return 1;
    }
}