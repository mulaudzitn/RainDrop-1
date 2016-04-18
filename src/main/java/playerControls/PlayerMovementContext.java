package playerControls;

public class PlayerMovementContext {
	private PlayerMovementInterface playerMovement;
	public  PlayerMovementContext (PlayerMovementInterface playerMovement){
		this.playerMovement = playerMovement;
	}
	
	public int executeMovementStrategy(int currentPosition_X_Axis ) 
	{
		return playerMovement.movePlayer(currentPosition_X_Axis);
	}

}
