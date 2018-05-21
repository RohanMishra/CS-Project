import javax.swing.ImageIcon;

/*************************************************************************************
Player is the main character that the user controls in the game. It will be controlled by the left and right arrow keys. It has a specific method of moving
*************************************************************************************/
public class Player extends Common implements Constants
{  

/******************************************************************************
Creates default player with starting x and y coordinates
Will be completed by: Rohan Mishra
******************************************************************************/
public Player()
{
	super((boardWidth/2), (boardHeight-100), 1, 0, “player.jpg”);
}

/******************************************************************************
Creates a player with specified x and y coordinates
@param x	set initial x coordinate
@param y	set initial y coordinate
@param img	set image
Will be completed by: Rohan Mishra
******************************************************************************/
public Player(int x, int y, ImageIcon img)
	{
		super(x, y, img);
	}
	
/******************************************************************************
Determines how the player will move based on keyboard inputs
Will be completed by: Rohan Mishra
******************************************************************************/
	public void movement()
	{
		setX(getX() + dx);
		setY(getY() + dy);
if (getX() < 0)
dx = 0;
if (getX() > (boardWidth - playerWidth))
dx = 0;		
	}
}
