import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class DrawSmiley extends JPanel {

	
	private static final long serialVersionUID = 1L;
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(35, 35, 200, 200);
		g.setColor(Color.BLACK);
		g.fillOval(55, 145, 150, 30);
		g.setColor(Color.YELLOW);
		g.fillOval(55, 135, 150, 30);
		g.setColor(Color.BLACK);
		g.fillOval(75, 100, 30, 30);
		g.setColor(Color.BLACK);
		g.fillOval(160, 100, 30, 30);
	}
}
