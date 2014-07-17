package pong;

import java.awt.*;

public final class Setting{

	private static condition instance = null;
	int WINDOW_POS_X;
	int WINDOW_POS_Y;
	int WINDOW_HEIGHT;
	int WINDOW_WIDTH;
	int PLAYER1_START_POS_X;
	int PLAYER1_START_POS_y;
	int PLAYER1_START_POS_X;
	int PLAYER1_START_POS_y;
	int MARGIN_X;
	int PADDLE_WIDTH;
	int PADDLE_HEIGHT;
	int REBOUND_LAYER;
	int BALL_DIAMETER;
	int SLEEP_TIME;
	int MAX_POINTS;
	int PLATE_SPEED;
	Color BALL_COLOR;
	Color PLATE_COLOR_PLAYER1;
	Color PLATE_COLOR_PLAYER2;
	Color BOOST_PAD_COLOR;
	Color BULLET_COLOR;
	int POINT_LAYER;
	
	public static Setting getInstance(){
		if(instance == null){
			instance = new Setting();
		}
		return instance;
	}
	
	public Setting(){
		initialize();
	}
	
	public void initialize(){
	
	WINDOW_POS_X = 300;
	WINDOW_POS_Y = 200;
	WINDOW_HEIGHT = 600;
	WINDOW_WIDTH = 400;
	PADDLE_WIDTH = 10;
	PADDLE_HEIGHT = 50;
	PLAYER1_START_POS_X = 10;
	PLAYER1_START_POS_Y = WINDOW_HEIGTH / 2;
	PLAYER1_START_POS_X = WINDOW_HEIGHT - PLATE_WIDTH - 15;
	PLAYER1_START_POS_Y = WINDOW_HEIGHT / 2;
	MARGIN_X = 8;
	REBOUND_LAYER = 5;
	BALL_DIAMETER = 7;
	SLEEP_TIME = 18;
	MAX_POINTS = 6;
	PLATE_SPEED = 2;
	BALL_COLOR = Color.BLACK;
	PLATE_COLOR_PLAYER1 = Color.BLUE;
	PLATE_COLOR_PLAYER2 = Color.BLUE;
	BOOST_PAD_COLOR = Color.ORANGE;
	BULLET_COLOR = Color.YELLOW;
	POINT_LAYER = 10;
	
	}
}