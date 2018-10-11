import javax.swing.*;
import java.awt.*;

public class Camembert extends JComponent {
	private Votes vote;

	public Camembert() {
		this.vote=new Votes();
	}

	@Override
	public void paintComponent(Graphics pinceau) {
		Graphics pin= pinceau.create();
		float nbVote=this.vote.getOui()+this.vote.getNon();
		int posX=this.getWidth()/2-25;
		int posY=this.getHeight()/2-25;

		pin.setColor(new Color(0,255,0));
		float oui=this.vote.getOui();
		float ouiArc=(float)(oui/nbVote*360.0f);
		pin.fillArc(posX,posY,50,50,0,(int)ouiArc);

		pin.setColor(new Color(255,0,0));
		float non=this.vote.getNon();
		float nonArc=(float)(non/nbVote*360.0f);
		pin.fillArc(posX,posY,50,50,(int)ouiArc,(int)nonArc); 
	}

	public void oui() {
		this.vote.voteOui();
		System.err.println(this.vote.getOui());
		this.repaint();
	}

	public void non() {
		this.vote.voteNon();
		System.err.println(this.vote.getNon());
		this.repaint();
	}

	public void fermerVote() {
		this.vote.close();
	}
}