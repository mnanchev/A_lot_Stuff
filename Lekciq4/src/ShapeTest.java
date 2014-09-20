import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ShapeTest {

	
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter 1 to draw rectangles\n"+"Enter 2 to draw ovals");
		int choice = Integer.parseInt(input);
		Shape panel = new Shape(choice);
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400,400);
		application.setVisible(true);
	}

}
