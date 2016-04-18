package gameScreen;

public class ScreenFrameSizeSetter {
	private final static int WINDOWHEIGHT = 800;
	private final static int WINDOWWIDTH = 600;
	private static int windowHeight;
	private static int windowWidth;
	
	public ScreenFrameSizeSetter()
	{
		windowHeight = WINDOWHEIGHT;
		windowWidth = WINDOWWIDTH;
				
	}
	
	
	public int getWindowHeight() {
		return windowHeight;
	}
	public static void setWindowHeight(int windowHeight) {
		if (windowHeight > 0)
		{
			ScreenFrameSizeSetter.windowHeight = windowHeight;
		}
		else 
			ScreenFrameSizeSetter.windowHeight = WINDOWHEIGHT;
		
	}
	public int getWindowWidth() {
		return windowWidth;
	}
	public static void setWindowWidth(int windowWidth) {
		if (windowWidth > 0)
		{
		ScreenFrameSizeSetter.windowWidth = windowWidth;
		}
		else
			ScreenFrameSizeSetter.windowWidth = WINDOWWIDTH;
		}
	

}
