import java.applet.*;
import java.awt.*;
public class GraphicsApplet5 extends Applet
{

     int x[]={100,250,350,500,480,340,300,150,120,70};
     int y[]={50,100,50,80,450,500,400,420,480,500};
     public void paint(Graphics g)
     {
		 g.setColor(Color.cyan);
		 g.fillPolygon(x,y,10);
	 }


}