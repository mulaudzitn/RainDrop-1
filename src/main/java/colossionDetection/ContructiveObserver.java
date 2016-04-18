package colossionDetection;

public class ContructiveObserver extends GameObserver{
 
	 public ContructiveObserver(ColissionDetector colissionDetector){
		      this.colissionDetector = colissionDetector;
		      this.colissionDetector.attach(this);
		   }

		   @Override
		   public boolean checkColission() {
		      System.out.println( "Binary String: " + Integer.toBinaryString( colissionDetector.getState() ) );
		      return false;
		   }
		}


