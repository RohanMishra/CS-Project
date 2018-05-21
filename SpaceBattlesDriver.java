/*************************************************************************************
Rohan Mishra, Ethan Ai, Bhargava Elavarthi - Space Battles
Space battles is an action packed game where a user controls a ship that must not let enemy ships pass. The user can shoot down the ships with the spacebar and move left and right with the arrow keys. As time goes on, the difficulty increases. The goal is to survive for as long as possible.
@author Rohan Mishra, Ethan Ai, Bhargava Elavarthi, May 2018
*************************************************************************************/
import javax.swing.JFrame;
public class SpaceBattlesDriver
{
public static void main(String[] args)
{
		JFrame frame = new JFrame("Space Invaders");
		frame.setLocation(100, 50);
       	frame.setDefaultCloseOperation(3);
        	frame.setContentPane(new Panel());
        	frame.setVisible(true);
}
}
