import biuoop.DrawSurface;

import java.awt.*;

public class ScoreIndicator implements Sprite{
    Game game;
    Counter counter;

    /**
     * Constructor
     */
    public ScoreIndicator(Game game, Counter counter) {
        this.game = game;
        this.counter = counter;
    }

    /**
     * draw the Score
     * @param d - surface
     */
    public void drawOn(DrawSurface d) {
        d.setColor(Color.BLACK);
        d.drawText(d.getWidth()/2,14, Integer.toString(counter.getValue()), 15);
    }

    /**
     * notify the sprite that time has passed.
     */
    public void timePassed() {

    }

    /**
     * add the ball to the game.
     * @param game - the game object
     */
    public void addToGame(Game game) {
        game.addSprite(this);
    }

}
