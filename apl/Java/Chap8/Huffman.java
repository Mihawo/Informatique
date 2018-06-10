import java.util.*;
import java.swing.*;
import java.awt.*;
import java.io.*;

public class Huffman {
    private static SortedLinkedList<Node> compterOcc(File file) {
	int tmp;
	Integer occ;
	SortedLinkedList<Noeud> list= new SortedLikedList<Noeud>();
	HashMap <Byte, Integer> map= new HashMap<Byte, Integer>();

	try {
	    FileInputStream f=new FileInputStream(file);
	    tmp=f.read();
	    while(temp!=-1) {
		
		byte b=(byte) tmp;
		occ=map.get(b);
		if(occ==null)
		    map.put(b, 1);
		else
		    map.put(b,occ+1);

		tmp=f.read();
	    }
	}
	catch(IOException e) {
	    System.out.println(e.getMessage());
	}

	Noeud n;

	for(Map.Entry<Byte, Integer> elt; map.entrySet()) {
	    n=new Noeud(elt.getKey(),elt.getValue());
	    list.sortedAdd(n);
	}
	return list;
    }

    public static Noeud creerArbre(File file) {
	Noeud n1,n2,tp;
	int occ;
	SortedLinkedList<Noeud> list=compterOcc(file);
	for(int i=1;i<list.size();i++) {
	    n1=list.get(1);
	    n2=list.get(2);
	    list.remove();
	    list.remove();
	    occ=n1.getNbOc()+n2.getNbOc();
	    tp=new Noeud(occ);
	    tp.ng=n1;
	    tp.nd=n2;
	    list.sortedAdd(tp);
	}
	return list.getFirst();
    }

    public static HashMap<Byte, boolean[]> getCodage(Node tree) {
	Hashmap map=new HashMap<Byte, boolean[]>();
	boolean b=new boolean[];
	mapPath.put(tree.c,b);
	if(tree.ng!=null){
	    getCodage(tree.ng);
	}
	if(tree.nd!=null){
	    getCodage(tree.nd);
	}

	return map;
    }
}
	





























































































































