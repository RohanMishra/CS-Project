import javax.swing.ImageIcon;
/*************************************************************************************
Powerups are collected by the user to provide an advantage over the enemies. A powerup spawns randomly and moves in the same speed as enemies.
Will be completed by: Ethan Ai
*************************************************************************************/
public class PowerUp extends Common implements Constants
{
/*************************************************************************************
Creates default PowerUp
Will be completed by: Ethan Ai
*************************************************************************************/
	public PowerUp()
	{
	}

/*************************************************************************************
Creates a powerup with a starting x and y. X will be randomly determined. This is similar to the generation of enemy ships.
@param x	sets initial x coordinate
@param y	sets initial y coordinate
Will be completed by: Ethan Ai
*************************************************************************************/
	public PowerUp(int x, int y)
	{
	}

/*************************************************************************************
Powerups move at the same speed as enemies, but the patterns are much less complicated and they do not get more complex as the game progresses.
Will be completed by: Ethan Ai
*************************************************************************************/
	public void movement()
	{
	}

/*************************************************************************************
Removes powerup from window once the player touches it. The player then inherits the ability specific to that powerup.
Will be completed by: Ethan Ai
*************************************************************************************/
	public void collected()
	{
	}
}
