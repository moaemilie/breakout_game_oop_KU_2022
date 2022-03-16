package breakout;

import java.awt.Point;

/**
 * This class represents a ball with a given ´diameter´, ´center´and ´INIT_BALL_VELOCITY´.
 *  
 * @immutable
 */

public class BallState {
	
	/**
	 * @invar | center.getX() > 0
	 * @invar | center.getY() > 0
	 * @invar | diameter > 0
	 */
	private Point center;
	private Vector INIT_BALL_VELOCITY;
	private int diameter;
	
	/**
	 * @throws IllegalArgumentException | diameter <= 0 
	 * @throws IllegalArgumentException | center.getY() > 0
	 * @throws IllegalArgumentException | center.getX() > 0
	 * 
	 * @post | getCenter() == center
	 * @post | getVelocity() == INIT_BALL_VELOCITY
	 */
	public BallState(Point center, int diameter, Vector INIT_BALL_VELOCITY) {
		if (diameter <= 0)
			throw new IllegalArgumentException();
		if (center.getY() > 0)
			throw new IllegalArgumentException();
		if (center.getX() > 0)
			throw new IllegalArgumentException();
		
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
