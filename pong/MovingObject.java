package pong;

import java.awt.*;

public abstract class MovingObject implements Movable {

	double xpos;
	double ypos;
	double centerpoint_x;
	double centerpoint_y;
	int speed; // pixels per second
	double aim;
	Color color;
	Game game;
	
	public MovingObject(Game game, double posx, double posy, int speed, Color color){
	
		xpos = posx;
		ypos = posy;
		this.speed = speed;
		this.game = game;
		centerpoint_x = getCenterpointX();
		centerpoint_y = getCenterpointY();
		this.color = color;
	
	}
	
	public void setAim(double angle){
	
		aim = angle % (2 * Math.PI);
	
	}
	
	public void move(double angle){
	
		setAim(angle);
		move();
	
	}
	
	public void move(){
	
		double step_x = Math.cos(aim) * speed;
		double step_y = Math.sin(aim) * speed;
		xpos += step_x;
		ypos += step_y;
		
		centerpoint_x = getCenterpointX();
		centerpoint_y = getCenterpointY();
	
	}

}