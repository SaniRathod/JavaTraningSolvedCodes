import java.applet.*;
import java.awt.*;
public class GraphicsApplet3 extends Applet
{
public void paint(Graphics g)
{

	g.drawRect(50,50,250,200);
	g.setColor(Color.yellow);
	g.fillRect(350,50,250,200);
	g.setColor(Color.blue);
	g.drawRoundRect(50,300,250,250,50,50);
	g.fillRoundRect(350,300,250,200,50,50);
}
}