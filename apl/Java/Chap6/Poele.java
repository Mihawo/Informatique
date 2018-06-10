import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.time.*;

public class Poele extends Produit{
	Poele(LocalDate dateCreation,Usine u){
		super(150,2.00f,3.90f, dateCreation.plusYears(3),u);
	}
}