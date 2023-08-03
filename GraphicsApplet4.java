import java.applet.*;
import java.awt.*;
public class GraphicsApplet4 extends Applet
{
public void paint(Graphics g)
{

	g.drawOval(50,50,250,200);
	g.setColor(Color.yellow);
	g.fillOval(350,50,250,200);
	g.setColor(Color.blue);
	g.drawOval(50,300,250,250);
	g.fillOval(350,300,250,250);
}
}