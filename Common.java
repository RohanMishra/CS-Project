import javax.swing.ImageIcon;
import java.awt.Graphics;

/*************************************************************************************
Common superclass with common methods which other ships or powerups inherit from. It has simple functions that sets X and Y coordinates, returns X and Y coordinates, sets change in x and change in y, returns change in x and change in y, sets an image, and returns an image
*************************************************************************************/
public class Common implements Constants
{	
	private int myX;
	private int myY;
	private double myDX;
	private double myDY;
	private ImageIcon myImg;
/******************************************************************************
Creates a default player
Will be completed by: Rohan Mishra
******************************************************************************/	
	public Common()
	{
		myX = 300;
		myY = 700;
		myDX = 1;
		myDY = 1;
	}


/******************************************************************************
Creates a Common with specified x and y coordinates, change in x and y, and image
@param x	set initial x coordinate
@param y	set initial y coordinate
@param dx	set change in x
@param dy	set change in y
@param img 	set image
Will be completed by: Rohan Mishra
******************************************************************************/
	public Common(int x, int y, int dx, int dy, ImageIcon img)
	{
		myX = x;
		myY = y;
		myDX = dx;
		myDY = dy;
		myImg = img;
	}

/******************************************************************************
Takes an Image argument and sets the image for the object
@param img	assigns img to myImg
Will be completed by: Bhargava Elavarthi
******************************************************************************/
	public void setImg(ImageIcon img)
	{
myImg = img;	
}

/******************************************************************************
Returns the image
@return myImg
Will be completed by:  Bhargava Elavarthi
******************************************************************************/
	public ImageIcon getImg()
	{ 
return myImg; 
}

/******************************************************************************
Takes an input integer x and sets the x coordinate of the object
@param x	assigns x to myX
Will be completed by:  Bhargava Elavarthi
******************************************************************************/
	public void setXval(int x)
	{
		myX = x;
	}


/******************************************************************************
Takes an integer y and sets the y coordinate of the object
@param y	assigns y to myY
Will be completed by:  Bhargava Elavarthi
******************************************************************************/
	public void setYval(int y)
	{
		myY = y;
	}

/******************************************************************************
Returns the x coordinate of the object
@return myX
Will be completed by:  Bhargava Elavarthi
******************************************************************************/
	public int getXval()
	{ 
return myX; 
}

/******************************************************************************
Returns the y coordinate of the object
@return myY
Will be completed by: Bhargava Elavarthi
******************************************************************************/
	public int getYval()
	{ 
return myY; 
}

/*************************************************************************************
Sets the change in x value
@param x	sets dx to x
Will be completed by: Rohan Mishra
*************************************************************************************/
public void setdx(double x)
	{
		myDX = x;
	}

/*************************************************************************************
Sets the change in y value
@param y	sets dy to y
Will be completed by: Rohan Mishra
*************************************************************************************/
public void setdy(double y)
	{
		myDY = y;
	}

/*************************************************************************************
Gets the change in x value
@return dx	returns the value of dx
Will be completed by: Rohan Mishra
*************************************************************************************/
public double getdx()
	{
		return myDX;
	}
/*************************************************************************************
Gets the change in y value
@return dy	returns the value of dy
Will be completed by: Rohan Mishra
*************************************************************************************/
public double getdy()
	{
		return myDY;
	}

/******************************************************************************
Takes a Graphic object myBuffer and draws the image onto the screen
@param myBuffer	 
Will be completed by:  Rohan Mishra
******************************************************************************/
	public void draw(Graphics myBuffer)
	{
		myBuffer.drawImage(myImg, 
	}
}
