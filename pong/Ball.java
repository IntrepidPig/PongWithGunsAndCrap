package pong;

public class Ball extends MovingObject {

	int diameter;
	boolean isInField;
	boolean collisionLock;
	boolean pointLock;
	
	public Ball(Game game, double posx, double posy, int speed, int diameter, Color color){
	
		super(game, posx, posy, speed, color);
		this.diameter = diameter;
		this.pointLock = false;
		this.collisionLock = false;
	
	}
	
	public boolean isMovingLeftToRight() {
	
		boolean leftToRight;
		if(super.aim > Math.PI * 3 / 2 || super.aim < Math.PI / 2) {
			leftToRight = true;
		}else{
			leftToRight = false;
		}
	
	}
	
	public boolean isMovingUpToDown() {
	
		boolean upToDown;
		if(super.aim > 0 && super.aim < Math.PI) {
			upToDown = true;
		}else{
			upToDown = false;
		}
	
	}
	
	// Change aim horizontally
	public void reflectHorizontally(){
		
		aim = Math.PI - aim;
		aim = aim % (2 * Math.PI);
	
	}
	
	// Change aim vertically
	public void reflectVertically{
		
		aim = Math.PI - aim;
		aim 
	
	}
	
	public double changeDirection {
	
		
	
	}
	
	@Override
	public double getCenterpointX(){
	
		return super.xpos;
	
	}
	
	@Override
	public double getCenterpointY(){
	
		return super.ypos;
	
	}

}