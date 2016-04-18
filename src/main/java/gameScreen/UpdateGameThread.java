package gameScreen;

import gameEnviromentals.FirstLevelEnvironment;

public class UpdateGameThread extends Thread{
	private FirstLevelEnvironment environment;
//	private RainDodgePanel gamePanel = new RainDodgePanel();
	
	 public volatile boolean stopped=false;
	
	    public void run() {
	    	 System.out.println("I am getting to game thread");
	        while (!stopped) {
	        	gamePanel.repaint();
	            try {
	                Thread.sleep(environment.getDropRepaintTimeMS());
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	 
	
}


	   

