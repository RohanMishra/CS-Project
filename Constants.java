/*************************************************************************************
Interface which every class will implement which has certain constants. Makes it easier to change a constant if something must be changed
*************************************************************************************/
public Interface Constants
{
	private int boardWidth = 600;
	private int boardHeight = 800;
	private int playerWidth = 100;
	private int playerHeight = 100;
	private int enemyWidth = 100;
	private int enemyHeight = 100;
	private int powerupWidth = 50;
	private int powerupHeight = 50;
	private int laserWidth = 20;
	private int laserHeight = 100;
	private ImageIcon playerImage = “player.jpg”;
	private ImageIcon enemyImage = “enemy.jpg”;
	private ImageIcon powerupImage = “powerup.jpg”;
	private ImageIcon laserImage = “laser.jpg”;
	private ImageIcon backgroundImage = “background.jpg”;
}
