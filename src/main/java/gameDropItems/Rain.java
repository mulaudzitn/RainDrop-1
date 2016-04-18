package gameDropItems;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.Random;

import gameEnviromentals.FirstLevelEnvironment;
import gameScreen.RainDodgePanel;



public class Rain {
	   private  float x0_Position;
	   private  float y0_Position;
	   private  float current_X_Position;
	   private  float current_Y_Position;
	   private  FirstLevelEnvironment environment = new FirstLevelEnvironment();
	   private  RainDodgePanel playPanel = new RainDodgePanel();
	
	  
	    public Rain() {
	        Random rain = new Random();
	        x0_Position = rain.nextInt(playPanel.getWidth());
	        y0_Position = 0;
	        System.out.println("I am getting to game Rain");
	    }

	    public void update() {
	        current_X_Position = x0_Position;
	        current_Y_Position = y0_Position;

	        x0_Position += environment.getWindSpeed();
	        y0_Position += environment.getGravitySpeed();
	    }

	    public void draw(Graphics2D g2) {
	        Line2D line = new Line2D.Double(x0_Position, y0_Position, current_X_Position, current_Y_Position);
	        g2.draw(line);
	    }

		public float getcurrent_X_Position() {
			return current_X_Position;
		}

		public void setcurrent_X_Position(float current_X_Position) {
			this.current_X_Position = current_X_Position;
		}

		public float getcurrent_Y_Position() {
			return current_Y_Position;
		}

		public void setcurrent_Y_Position(float current_Y_Position) {
			this.current_Y_Position = current_Y_Position;
		}



}
