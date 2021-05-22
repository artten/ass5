// a BlockRemover is in charge of removing blocks from the game, as well as keeping count
// of the number of blocks that remain.
public class BlockRemover implements HitListener {
    private Game game;
    private Counter remainingBlocks;

    /**
     * constructor.
     * @param game - the game
     * @param  remainingBlocks - the blocks that remains
     */
    public BlockRemover(Game game, Counter  remainingBlocks) {
        this.game = game;
        this.remainingBlocks =  remainingBlocks;
    }

    /**
     * add number of blocks
     */
    public void addedBlock(int num) {
        remainingBlocks.increase(num);
    }

    // Blocks that are hit should be removed
    // from the game. Remember to remove this listener from the block
    // that is being removed from the game.
    public void hitEvent(Block beingHit, Ball hitter) {
        this.remainingBlocks.decrease(1);
        beingHit.removeHitListener(beingHit.getHitListener().get(0));
        this.game.removeSprite(beingHit);
        this.game.removeCollidable(beingHit);
    }

    public int remainedBalls() {
        return remainingBlocks.getValue();
    }
}