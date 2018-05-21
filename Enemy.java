import javax.swing.ImageIcon;
/*************************************************************************************
Enemy is the opposing ships that the player has to shoot down with the lasers. The user must not let the enemy pass them, or else it’s game over. It’s movement speed will increase overtime, and it has a method of destruction
Will be completed by: Ethan Ai
*************************************************************************************/

public class Enemy extends Common implements Constants
{
/*************************************************************************************
Sets default enemy 
Will be completed by: Ethan Ai
*************************************************************************************/
	public Enemy()
	{
		super((boardWidth/2), 100, 0, 1, “enemy.jpg”);
	}
/*************************************************************************************
Sets initial enemy with x and y coordinate
@param x	sets initial x coordinate
@param y	sets initial y coordinate
@param dx	set change in x
@param dy	set change in y
@param img	set image
Will be completed by: Ethan Ai
*************************************************************************************/
	public Enemy(int x, int y, int dx, int dy, ImageIcon img)
	{
		super(x, y, dx, dy, img);
	}

/*************************************************************************************
Determines the movements of the enemy ships. The ship speed will increase over time.
@param s	sets the speed of the ship
Will be completed by:  Ethan Ai *************************************************************************************/
	public void movement(int s)
	{
		
	}

/*************************************************************************************
Destroys individual enemy ships that have been damaged beyond a certain condition by the player
Will be completed by: Ethan Ai
*************************************************************************************/ 
	public void destroyed()
	{
	}
}
