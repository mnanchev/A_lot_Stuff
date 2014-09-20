import javax.swing.JFrame;
public class DrawPanelTest {

	
	public static void main(String[] args) {
		DrawPanel p = new DrawPanel();
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(p);
		application.setSize(250, 250);
		application.setVisible(true);
	}

}
