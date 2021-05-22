public class Counter {
    private int number = 0;

    /**
     * add number to current count.
     * @param number - add to this number
     */
    void increase(int number){
        this.number = this.number + number;
    }

    /**
     *  subtract number from current count.
     * @param number - subtract from this number
     */
    void decrease(int number){
        this.number = this.number - number;
    }

    /**
     *  get current count.
     * @return number
     */
    int getValue(){
        return this.number;
    }
}