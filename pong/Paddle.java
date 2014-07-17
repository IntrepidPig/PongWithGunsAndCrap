package pong;

/*
write constructor for this class.
write also following methods:
double get_centerpoint_x(); //override it
double get_centerpoint_y(); // override it
change_height_randomly(); // random number up to 50% shrinkage 
--> limits of random generator are 0 to 50 % of height
change_color_randomly(); // change color to either red, blue,
 yellow or green (or pink) // you might look up how to get Colors

create following members and assign/instantiate in constructor (think about
useful data types):
points
height
width
height
is_shooter;
has_triggered_shot

*/


public class Paddle extends MovingObject {

	int points;
	int width;
	int height;
	boolean isShooter;
	boolean isShotTriggered;
	
	public Paddle(Game game, double posx, double posy, int speed, int width, int height, Color color){
	
		super(game, posx, posy, speed, color);
		this.points = 0;
		this.width = width;
		this.height = height;
		this.isShooter = false;
		this.isShotTriggered = false;
	
	}
	
	@Override
	public double getCenterpointX(){
	
		return posx + width / 2;
	
	}
	
	@Override
	public double getCenterpointY(){
	
		return posy + height / 2;
	
	}
	
	public void changeHeightRandomly(){
	
		Random rd = new Random();
		int change = rd.nextInt(50) + 50;
		heigth = height * (change / 100)
	
	}
	
	public void changeColorRandomly(){
		
		// I don't have the heart to delete any of my hard-worked on code, so I just comment it ;D
		
		Color[] colors = {Color.BLUE, Color.RED, Color.YELLOW, Color.GREEN, Color.PINK};
		Random rd = new Random();
		int icolor = rd.nextInt(5);
		super.color = colors[icolor];
		/* switch(icolor){
			case 0:
				super.color = Color.BLUE;
				break;
			case 1:
				super.color = Color.RED;
				break;
			case 2:
				super.color = Color.YELLOW;
				break;
			case 3:
				super.color = Color.GREEN;
				break;
			case 4:
				super.color = Color.PINK;
				break;
			default: break;
		} */
	
	}
}