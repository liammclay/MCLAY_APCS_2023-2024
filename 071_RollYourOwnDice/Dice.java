
public class Dice {
    private int numSides;
    private int currentValue;


    public Dice(int numSides){
        this.numSides = numSides;
    }
    public int roll(){
        int roll = (int) (Math.random()*numSides)+1;
        setCurrentValue(roll);
        return getCurrentvalue();
    }

    public int getCurrentvalue(){
        return currentValue;
    }
    public void setCurrentValue(int addValue){
        currentValue+=addValue;
    }
}
