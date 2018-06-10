import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.time.*;


public interface Observateur {
	void evenementProduitVendu(Magasin m, Usine u, int codeProduit, LocalDate aujourdhui);
}
