import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawCircles extends JPanel
{
// draws concentric circles at the center of the panel
public void paintComponent( Graphics g )


{
super.paintComponent( g );
int circles = 12; // number of circles
int radius = 10; // radius of a circle
// find the middle of the panel
int centerX = getWidth() / 2;
int centerY = getHeight() / 2;
int counter = 1; // initialize the counter
// draws circles starting with the innermost
do
{
// draw the oval
g.drawOval( centerX - counter * radius,
centerY - counter * radius,
counter * radius * 2, counter * radius * 2 );
counter++;
} while ( counter <= circles ); // end do...while
} // end method paintComponent
} 