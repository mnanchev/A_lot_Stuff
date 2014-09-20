import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawPanel extends JPanel{
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
			y = height - ((n*height)/15);
			x = 0 + ((n*width)/15);
			g.drawLine(0, 0, x, y);
			n++;
		}
		while(m <= 15){
			y = 0 + ((m*height)/15);
			x = width - ((m*width)/15);
			g.drawLine(width, height, x, y);
			m++;
		}
		while(b <= 15){
			y = 0 + ((b*height)/15);
			x = 0 + ((b*width)/15);
			g.drawLine(0, height, x, y);
			b++;
		}
		while(c <= 15){
			y = 0 + ((c*height)/15);
			x = 0 + ((c*width)/15);
			g.drawLine(width, 0, x, y);
			c++;
		}
		
	}
}
