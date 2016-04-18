package colossionDetection;

public class DestructiveObserver extends GameObserver{
	

		   public DestructiveObserver (ColissionDetector colissionDetector){
		      this.colissionDetector = colissionDetector;
		      this.colissionDetector.attach(this);
		   }

		   @Override
		   public boolean checkColission() {
		      System.out.println( "Binary String: " + Integer.toBinaryString( colissionDetector.getState() ) ); 
		     return true;
		   }
		}


