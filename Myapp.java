import java.awt.*;
import java.applet.*;

public class Myapp extends Applet{
	public void paint(Graphics g){
		g.setColor(Color.yellow);  
		g.fillOval(100,100,100,100);
		g.setColor(Color.black);
		g.fillRect(120,125,20,20);
		g.drawLine(135,135,160,135);
		g.fillRect(160,125,20,20);
		g.drawLine (150,165,150,180);
	}
}
