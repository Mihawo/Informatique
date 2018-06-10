import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.time.*;

public class Choucroute extends Produit{
	Choucroute(LocalDate dateCreation, Usine u){
		super(240,1.80f,3.40f,dateCreation.plusYears(5),u);
	}
}