import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.awt.event.*;

/*************************************************************************************
Panel is where most of the logic of the game is. This is where the running, the starting, and the ending of the game is
Will be completed by: Rohan Mishra
*************************************************************************************/
public class Panel extends JPanel implements Constants
{
	private BufferedImage myImage;
    	private Graphics myBuffer;
    	private Timer t;
	Player player;
/*************************************************************************************
This creates the initial panel and instantiates all Objects
Will be completed by: Rohan Mishra
*************************************************************************************/
public Panel()
	{
		myImage = new BufferedImage(boardWidth, boardHeight, 1);
		myBuffer = myImage.getGraphics();
		myBuffer.setColor(Color.gray);
		myBuffer.fillRect(0, 0, boardWidth, boardHeight);
		player = new Player((boardWidth/2), (boardHeight - 100), playerImage);
		
		t1 = new Timer(5, new Listener());
		t1.start();
		addKeyListener(new Key());
		setFocusable(true);
	}

/*************************************************************************************
This listener class will perform all the movements that happen with the objects
Will be completed by: Rohan Mishra
*************************************************************************************/
private class Listener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		myBuffer.setColor(Panel.background);
		myBuffer.fillRect(0, 0, 400, 400);
		player.movement();
		player.draw(myBuffer);
		myBuffer.setColor(Color.gray);
		repaint();
		
	}
}

/******************************************************************************
The Key class responds to certain keys being pressed. If the left arrow is 
pressed, it will go left, if the right arrow is pressed, it will go right. If 
the space arrow is pressed, it will shoot a laser.
@param	e	keyboard event
Will be completed by: Rohan Mishra
******************************************************************************/
	private class Key extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			if (e.getKeyCode() == 37 && player.getX() < boardwidth - playerwidth)
				player.setX(player.getX() - 10);
			else if (e.getKeyCOde() == 39 && player.getX() > playerwidth)
				player.setX(player.getX() + 10);
		}
	}


/*************************************************************************************
Determines and returns the distance between two points
@param x1	first x coordinate
@param y1	first y coordinate
@param x2	second x coordinate
@param y2	second y coordinate
@return d	returns the distance
Will be completed by: Rohan Mishra
*************************************************************************************/	
	public double distance(double x1, double y1, double x2, double y2)
	{
		double d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		return d;
	}

/*************************************************************************************
Objects have a hitbox that includes the actual image and maybe a small buffer around 
it. Once part of one object’s hitbox touches another object’s hitbox registers as a 
collision and something is done. Returns a boolean with either true or false
@param a	One object
@param b	Another object
@return collide	Returns the boolean
Will be completed by: Rohan Mishra
*************************************************************************************/
	public boolean hit(Object a, Object b)
	{
		if distance(a.getXval(), a.getYval(), b.getXval(), b.getYval())
			boolean collide = true;
		return collide;
	}

/*************************************************************************************
Creates window with appropriate dimensions. Provides the start screen
@param w	sets w as width of window
@param h	sets h as height of window
Will be completed by: Rohan Mishra
*************************************************************************************/ 
	public void startGame(int w, int h)
	{
		String[] choices = {"Start!", "Exit"}
		JOptionPane.showMessageDialog(null, "Space Invaders! Click Start to Play!", 
			"Space Invaders", JOptionPane.YES_NO_CANCEL_OPTION, 
			JOptionPane.QUESTION_MESSAGE, null, choices, choices[2]);

	}

/*************************************************************************************
Ends game and prevents any new objects from being created. Will show the gameover screen
Will be completed by: Rohan Mishra
*************************************************************************************/
	public void gameOver()
	{
		JOptionPane.showMessageDialog(null, "Game Over!");
	}

/*************************************************************************************
Imports images and applies them to instantiated objects. Sets up the background.
@param g	takes g for graphics argument
Will be completed by: Rohan Mishra
*************************************************************************************/
	public void paintComponent(Graphics g)
	{
		g.drawImage(myImage, 0, 0, boardWidth, boardHeight, null);
	}
}
