public class Food {
    private double ratingTen;
    private int calories;

    public Food(double ratingTen, int calories){
        this.ratingTen = ratingTen;
        this.calories = calories;
    }

    public int getCalories(){
        return calories;
    }

    public void eat(){
        System.out.println("Yum yum, munch mucnh.");
    }

    
}
