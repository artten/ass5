/**
 * @author 319339198
 */
/**
 * collidable.
 */
public interface Collidable {
    /**
     * Return the "collision shape" of the object.
     * @return the "collision shape" of the object.
     */
    Rectangle getCollisionRectangle();

    /**
     *  Notify the object that we collided with it at collisionPoint with a given velocity.
     *  The return is the new velocity expected after the hit (based on
     *  the force the object inflicted on us).
     * @param hitter - the ball
     * @param collisionPoint - the collision point
     * @param currentVelocity - this velocity
     * @return - new velocity
     */
    Velocity hit(Ball hitter, Point collisionPoint, Velocity currentVelocity);
}