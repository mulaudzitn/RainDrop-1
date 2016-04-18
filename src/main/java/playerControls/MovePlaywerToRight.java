package playerControls;

public class MovePlaywerToRight implements PlayerMovementInterface {
	
	public int movePlayer(int currentPosition_X_Axis  )
	{
		return currentPosition_X_Axis++;
	}

}
