import java.awt.Graphics;
import javax.swing.JPanel;
public class Assignment10 extends JPanel{
	private static final long serialVersionUID = 1L;
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int radius = 10;
		int centerX = getWidth() / 2;
		int centerY = getHeight() / 2;
		int counter = 12;
		for(int i = 1;i<=counter;i++){
			
				
				g.drawOval(centerX-radius*i, centerY-radius*i, 2*radius*i ,2*radius*i );
				
				
			
			}
	}
}
