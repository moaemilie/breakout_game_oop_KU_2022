package breakout;

import java.awt.Point;

/**
 * 
 * @invar ??
 * 
 * 
 */

public class BallState {
	
	/**
	 * 
	 */
	private Point center;
	private Vector INIT_BALL_VELOCITY;
	private int diameter;
	
	/**
	 * @post | getCenter() == center
	 * @post | getVelocity() == INIT_BALL_VELOCITY
	 */
	public BallState(Point center, diameter, Vector INIT_BALL_VELOCITY) {
		this.center = center; 
		this.diameter = diameter;
		this.INIT_BALL_VELOCITY = INIT_BALL_VELOCITY;
	}
	
	/**
	 * Returns the center of the ball
	 */
	public Point getCenter() {
		return center;
	}
	
	/**
	 * Returns the velocity of the ball
	 */
	public Vector getVelocity() {
		return INIT_BALL_VELOCITY;
	}
}
