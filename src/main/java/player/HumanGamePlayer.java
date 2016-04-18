package player;
import java.awt.Graphics;
public class HumanGamePlayer implements GamePlayerInterface {
	
	   
		public HumanGamePlayer ()
		{
			drawGamePlayer();
		}
		 public void drawGamePlayer()
		 {
			Graphics graphics = null;
			
			paint(graphics); 
		 }
		 
		 public void paint(Graphics g) {
			    g.drawRect (10, 10, 20, 20);  
			  }
	}



