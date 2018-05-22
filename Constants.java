/*************************************************************************************
Interface which every class will implement which has certain constants. Makes it easier to change a constant if something must be changed
*************************************************************************************/
import javax.swing.ImageIcon;
public Interface Constants
{
	public static final int boardWidth = 600;
	public static final int boardHeight = 800;
	public static final int playerWidth = 100;
	public static final int playerHeight = 100;
	public static final int enemyWidth = 100;
	public static final int enemyHeight = 100;
	public static final int powerupWidth = 50;
	public static final int powerupHeight = 50;
	public static final int laserWidth = 20;
	public static final int laserHeight = 100;
	public static final String playerImage = "player.jpg";
	public static final String enemyImage = "enemy.jpg";
	public static final String powerupImage = "powerup.jpg";
	public static final String laserImage = "laser.jpg";
	public static final String backgroundImage = "background.jpg";
}
