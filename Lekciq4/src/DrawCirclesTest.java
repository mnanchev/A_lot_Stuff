import javax.swing.JFrame;
public class DrawCirclesTest
{
public static void main( String args[] )
{
DrawCircles panel = new DrawCircles();
JFrame application = new JFrame();
application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
application.add( panel );
application.setSize( 300, 300 );
application.setVisible( true );
} // end main
} 