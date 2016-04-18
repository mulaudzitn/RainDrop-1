package player;

import java.awt.Graphics;



public class SimpleGamePlayer implements GamePlayerInterface {
	   
	public SimpleGamePlayer ()
	{
		
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
