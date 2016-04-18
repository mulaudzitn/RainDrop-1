package gameScreen;

import javax.swing.JFrame;

public class GameScreenJFrame {
     private static ScreenFrameSizeSetter frameSize;
     private final static RainDodgePanel gamePanel =  new RainDodgePanel();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("I am getting to  Main");
		frameSize = new ScreenFrameSizeSetter();
			
		
		JFrame gameJframe = new JFrame ("Rain Rain Dodge Game");
		gameJframe.setSize(frameSize.getWindowHeight(), frameSize.getWindowWidth());
		
		gameJframe.add(gamePanel);
	    System.out.println("I am getting to  add game panel");
		gameJframe.setResizable(false);
		gameJframe.setVisible(true);
		gameJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

}
