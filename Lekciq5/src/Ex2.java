import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;
public class Ex2 extends JPanel {
	
	private static final long serialVersionUID = 1L;
	Random r = new Random();
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i = 1; i<=10;i++){
			int n = r.nextInt(5);
			int red = r.nextInt(256);
			int green = r.nextInt(256);
			int blue = r.nextInt(256);
			Color cl = new Color(red,green,blue);
			switch (n){
			case 0: g.setColor(cl); g.fillOval(r.nextInt(200), r.nextInt(200), r.nextInt(80), r.nextInt(80)); break;
			case 1: g.setColor(cl); g.fillRect(r.nextInt(200), r.nextInt(200), r.nextInt(80), r.nextInt(80)); break;
			case 2: g.setColor(cl); g.fillOval(r.nextInt(200), r.nextInt(200), r.nextInt(80), r.nextInt(80)); break;
			case 3: g.setColor(cl); g.fillRect(r.nextInt(200), r.nextInt(200), r.nextInt(80), r.nextInt(80)); break;
			case 4: g.setColor(cl); g.fillOval(r.nextInt(200), r.nextInt(200), r.nextInt(80), r.nextInt(80)); break;
			default: g.setColor(cl); g.fillOval(r.nextInt(200), r.nextInt(200), r.nextInt(80), r.nextInt(80)); break;
			}
		}
	}
}
