package gameDropItems;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import gameEnviromentals.FirstLevelEnvironment;
public class Drop {
	

	   private double x0_Position;  
	   private double y0_Position;  
	   private double initialVelocity; //initial velocity
	   private double time;  //time
	   private double angle;
	   private double current_X_Position;
	   private double current_Y_Position;
       private FirstLevelEnvironment environment = new FirstLevelEnvironment() ;
       
     public Drop(double  x_Position,double y_Position ) {
	        super();
	        System.out.println("I am getting to Drop");
	 //       this.x0_Position = x_Position;
	 //       this.y0_Position = y_Position;

	        initialVelocity = environment.getDropInitialVelocity();
	        angle = Math.toRadians(Math.round(Math.random() * 180)); //from 0 - 180 degrees
      }

	    public void update() {
	        // double g=10;
	        time += environment.getDropRepaintTimeMS() / 100f;
	        current_X_Position = x0_Position +  initialVelocity * time * Math.cos(angle);
	        current_Y_Position = y0_Position - (initialVelocity * time * Math.sin(angle) - environment.getGravitySpeed() * time * time / 2);
	        System.out.println("Drop Update");
	    }

	    public void draw(Graphics2D g2) {
	        Ellipse2D.Double circle = new Ellipse2D.Double(current_X_Position, current_Y_Position, environment.getDropDiameter(), environment.getDropDiameter());
	        g2.fill(circle);
	    }

		public double getcurrent_X_Position() {
			return current_X_Position;
		}

		public void setcurrent_X_Position(double current_X_Position) {
			this.current_X_Position = current_X_Position;
		}

		public double getcurrent_Y_Position() {
			return current_Y_Position;
		}

		public void setcurrent_Y_Position(double current_Y_Position) {
			this.current_Y_Position = current_Y_Position;
		}
	    
	    
	}
	


