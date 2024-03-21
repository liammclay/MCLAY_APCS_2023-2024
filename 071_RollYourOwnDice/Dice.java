
public class Dice {
    private int numSides;
    private int currentValue;


    public Dice(int numSides){
        this.numSides = numSides;
    }
    public int roll(){
        int roll = (int) ((1+Math.random())*numSides);
        setCurrentValue(roll);
        return getCurrentvalue();
    }

    public int getCurrentvalue(){
        return currentValue;
    }
    public int setCurrentValue(int addValue){
        return currentValue+addValue;
    }
}
