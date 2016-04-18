package playerControls;

public class MovePlayerToLeft implements PlayerMovementInterface {
	public int movePlayer(int currentPosition_X_Axis )
	{
		return currentPosition_X_Axis--;
	}

}
