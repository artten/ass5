public class ScoreTrackingListener implements HitListener {
    private Counter currentScore;
    private Game game;

    /**
     * Constructor.
     * @param scoreCounter
     */
    public ScoreTrackingListener(Game game, Counter scoreCounter) {
        this.currentScore = scoreCounter;
        this.game = game;
    }

    /**
     * add 5 point for hit block
     * @param beingHit - the block that was hist
     * @param hitter - this ball that hit the block
     */
    public void hitEvent(Block beingHit, Ball hitter) {
       this.currentScore.increase(5);
    }

    /**
     * add points to the score
     * @param num - points to add
     */
    public void addScore(int num) {
        this.currentScore.increase(num);
    }


}