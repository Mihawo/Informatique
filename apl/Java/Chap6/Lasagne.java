import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.time.*;

public class Lasagne extends Produit{
	Lasagne(LocalDate dateCreation, Usine u){
		super(280,0.30f,3.20f, dateCreation.plusYears(3),u);
	}
}