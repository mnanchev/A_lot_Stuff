import java.awt.Graphics;
import javax.swing.JPanel;
public class Assignment13 extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g){
		super.paintComponents(g);
		int width = getWidth();
		int height = getHeight();
		int n = 0;
		int m = 0;
		int c = 0;
		int b = 0;
		int x = 0;
		int y = height;
		while(n <= 15){
			y = 0 + ((n*height)/15);
			x = 0 + ((n*width)/15);
			g.drawLine(0, y, x, height);
			n++;
		}
		while(m <= 15){
			y = 0 + ((m*height)/15);
			x = width - ((m*width)/15);
			g.drawLine(x, 0, 0, y);
			m++;
		}
		while(c <= 15){
			y = 0 + ((c*height)/15);
			x = width - ((c*width)/15);
			g.drawLine(width, y, x, height);
			c++;
		}
		while(b <= 15){
			y = 0 + ((b*height)/15);
			x = 0 + ((b*width)/15);
			g.drawLine(x, 0, width, y);
			b++;
		}
	
	
	}
}