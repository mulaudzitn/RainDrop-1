package gameScreen;

import java.awt.BasicStroke;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

import gameDropItems.Drop;
import gameDropItems.Rain;
import gameEnviromentals.FirstLevelEnvironment;
import gameInputControls.GameKeyListener;
import player.GamePlayerFactory;
import player.GamePlayerInterface;

public class RainDodgePanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UpdateGameThread mUpdateThread;
	private FirstLevelEnvironment environment;
	private GamePlayerFactory playerFactory  = new GamePlayerFactory();
	private GamePlayerInterface player;
//	private Drop drop;
    
    private ArrayList<Rain> rainV;
 	private ArrayList<Drop> dropV;
	
	
	public RainDodgePanel() {
		player = playerFactory.getPlayer("SimpleGamePlayer");
		System.out.println("I am getting to  panel");
		environment = new FirstLevelEnvironment();
		setFocusable(true);
//		drop = new Drop();
		rainV = new ArrayList<>();
		dropV = new ArrayList<>();  
		
	    repaint();

	  //  mUpdateThread=new UpdateGameThread();
	  //  mUpdateThread.start();
	}
    
	public void stop() {
	    mUpdateThread.stopped=true;
	}

	
	public int getHeight() {
	    return this.getSize().height;
	}

	public int getWidth() {
	    return this.getSize().width;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		  System.out.println("I am Painting");
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(environment.getRainWidth()));
			g2.setColor(environment.getDropColor());
           // player.drawGamePlayer();
			//DRAW DROPS
			Iterator<Drop> iterator2 = dropV.iterator();
			while (iterator2.hasNext()) {
			    Drop drop = iterator2.next();
			    drop.update();
			    drop.draw(g2);

			    if (drop.getcurrent_Y_Position()>= getHeight()) {
			        iterator2.remove();
			    }
			}

	 //DRAW RAIN
    Iterator<Rain> iterator = rainV.iterator();
    while (iterator.hasNext()) {
        Rain rain = iterator.next();
        rain.update();
        rain.draw(g2);

        if (rain.getcurrent_Y_Position() >= getHeight()) {
            //create new drops (2-8)
            long dropCount = 1 + Math.round(Math.random() * 4);
            for (int i = 0; i < dropCount; i++) {
                dropV.add(new Drop(rain.getcurrent_X_Position(),getHeight()));
            }
            iterator.remove();

        }
    }

    //CREATE NEW RAIN
    if (Math.random() <environment.getRainChance()) {
        rainV.add(new Rain());
    } 
} 



}
