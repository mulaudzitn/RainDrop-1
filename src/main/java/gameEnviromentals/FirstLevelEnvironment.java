package gameEnviromentals;

import java.awt.Color;

public class FirstLevelEnvironment {
	private float windSpeed;
	private float gravitySpeed;
	private double rainChance; // from 0 to 1

	private int  dropRepaintTimeMS;
	private float RainWidth;
	private double dropInitialVelocity;
	private double dropDiameter;
	private Color dropColor;
	
	// default values 
	
	private final float WINDSPEED = 2.05f;
	private final float GRAVITYSPEED =  9.8f;
	private final double RAINCHANCE = 0.09;
	
	private final int  DROPREPAINTTIMESMILLISECONDS = 16;
	private final float RAINWIDTH =1;
	private final double DROPINITIALVELOCITY = 20;
	private final double DROPDIAMETER = 5;
	private final Color DROPCOLOR=new Color(0, 0, 255);
	
	public FirstLevelEnvironment()
	{
		
	}
	
	public void setRainDropGameEnvironmentals() {
		// TODO Auto-generated method stub
		setWindSpeed(WINDSPEED);
		setGravitySpeed(GRAVITYSPEED);
		setRainChance(RAINCHANCE);
		//
		setDropRepaintTimeMS(DROPREPAINTTIMESMILLISECONDS);
		setRainWidth(RAINWIDTH);
		setDropInitialVelocity(DROPINITIALVELOCITY);
		setDropDiameter(DROPDIAMETER );
		setDropColor(DROPCOLOR);
	}


	public float getWindSpeed() {
		return windSpeed;
	}


	public void setWindSpeed(float windSpeed) {
		this.windSpeed = windSpeed;
	}


	public float getGravitySpeed() {
		return gravitySpeed;
	}


	public void setGravitySpeed(float gravitySpeed) {
		this.gravitySpeed = gravitySpeed;
	}


	public double getRainChance() {
		return rainChance;
	}


	public void setRainChance(double rainChance) {
		this.rainChance = rainChance;
	}


	public int getDropRepaintTimeMS() {
		return dropRepaintTimeMS;
	}


	public void setDropRepaintTimeMS(int dropRepaintTimeMS) {
		this.dropRepaintTimeMS = dropRepaintTimeMS;
	}


	public float getRainWidth() {
		return RainWidth;
	}


	public void setRainWidth(float rainWidth) {
		RainWidth = rainWidth;
	}


	public double getDropInitialVelocity() {
		return dropInitialVelocity;
	}


	public void setDropInitialVelocity(double dropInitialVelocity) {
		this.dropInitialVelocity = dropInitialVelocity;
	}


	public double getDropDiameter() {
		return dropDiameter;
	}


	public void setDropDiameter(double dropDiameter) {
		this.dropDiameter = dropDiameter;
	}


	public Color getDropColor() {
		return dropColor;
	}


	public void setDropColor(Color dropColor) {
		this.dropColor = dropColor;
	}
	
	
	

	
}
