import java.awt.event.*;

public class ListenerDeux implements MouseListener {
	private Fenetre fen;

	public ListenerDeux(Fenetre f) {
		this.fen=f;
	}

	public void mouseClicked(MouseEvent e) {
		this.fen.changerCard("EcranPrincipal");
	}

	public void mousePressed(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
}