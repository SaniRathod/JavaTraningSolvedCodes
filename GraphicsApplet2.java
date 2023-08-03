import java.applet.*;
import java.awt.*;
public class GraphicsApplet2 extends Applet
{
public void paint(Graphics g)
{

	g.drawArc(50,50,250,200,45,180);
	g.setColor(Color.yellow);
	g.fillArc(350,50,250,200,90,270);
	g.setColor(Color.blue);
	g.drawArc(50,300,250,250,0,270);
	g.fillArc(350,300,250,250,180,90);
}
}