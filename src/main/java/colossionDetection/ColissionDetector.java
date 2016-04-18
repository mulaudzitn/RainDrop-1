package colossionDetection;
import java.util.ArrayList;
import java.util.List;


public class ColissionDetector {
	private List<GameObserver> observers = new ArrayList<GameObserver>();
	   private int state;

	   public int getState() {
	      return state;
	   }
	   

	   public void setState(int state) {
	      this.state = state;
	      notifyAllObservers();
	   }

	   public void attach(GameObserver observer){
	      observers.add(observer);		
	   }

	   public void notifyAllObservers(){
	      for (GameObserver observer : observers) {
	         observer.checkColission();
	      }
	   } 	
	
}
