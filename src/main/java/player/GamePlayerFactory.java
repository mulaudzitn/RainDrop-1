package player;

public class GamePlayerFactory {
	public GamePlayerInterface  getPlayer(String playerType)
	{
		if(playerType == null){
	         return null;
	      }		
	      if(playerType.equalsIgnoreCase("SimpleGamePlayer")){
	         return new SimpleGamePlayer();
	         
	      } else if(playerType.equalsIgnoreCase("HumanGamePlayer")){
	         return new HumanGamePlayer();
	      }
	         else	      
	         return null;
	   }
		
	}


