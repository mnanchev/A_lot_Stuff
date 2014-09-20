import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Assignment10Test {

	
	public static void main(String[] args) {
		
		Assignment10 panel = new Assignment10();
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300,300);
		application.setVisible(true);
		
	}

}
