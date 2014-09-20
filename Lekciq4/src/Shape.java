import java.awt.Graphics;
import javax.swing.JPanel;
public class Shape extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int choice;
	public Shape(int choise){
		this.setChoice(choise);
	}
	public int getChoice() {
		return choice;
	}
	public void setChoice(int choice) {
		this.choice = choice;
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i = 0;i<=10;i++){
			switch(choice){
			case 1:
				g.drawRect(0+i*30, 0+i*30, 150-i*10, 150-i*10);
				break;
			case 2:
				g.drawOval(0+i*30, 0+i*30, 150-i*10, 150-i*10);
				break;
			}
		}
	}

}
