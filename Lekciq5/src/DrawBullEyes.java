import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import java.util.Random;
public class DrawBullEyes extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Random r = new Random();
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i = 0;i<=10;i++){
			/*int red = r.nextInt(256);
			int green = r.nextInt(256);
			int blue = r.nextInt(255);
			Color cl = new Color(red,green,blue);
			g.setColor(cl);**/
			if(i%2==0){
				g.setColor(Color.RED);
				g.fillOval(20+i*10, 20+10*i, 220-i*20,220-i*20);
			}
			else{
				g.setColor(Color.WHITE);
			g.fillOval(20+i*10, 20+10*i, 220-i*20,220-i*20);
			
			}
		}
		
	}

	
}
