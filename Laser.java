import javax.swing.ImageIcon;
/*************************************************************************************
Lasers are what the user shoots to destroy the incoming enemy ships. They have a certain movement and spawn at the same x coordinate as the user
Will be completed by: Bhargava Elavarthi
*************************************************************************************/
public class Laser extends Common implements Constants
{
/*************************************************************************************
Creates default laser
Will be completed by: Bhargava Elavarthi
*************************************************************************************/	
	public Laser()
	{
	}

/*************************************************************************************
Creates a laser with given x and y coordinates
@param x	sets x coordinate
@param y	sets y coordinate
Will be completed by: Bhargava Elavarthi
*************************************************************************************/	
public Laser(int x, int y)
	{
	}

/*************************************************************************************
The laser moves in a linear pattern and has a speed slightly faster than the player and enemy ships.
Will be completed by: Bhargava Elavarthi
*************************************************************************************/ 
	public void movement()
	{
	}

/*************************************************************************************
Once a laser has exited the window without hitting anything, it is deleted to prevent hundreds of useless laser objects from staying in the program.
Will be completed by: Bhargava Elavarthi
*************************************************************************************/
	public void miss()
	{
	}
}
