import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.time.*;

public interface Observable {
	void ajouterObservateur(Observateur o);
	void supprimerObservateur(Observateur o);
}