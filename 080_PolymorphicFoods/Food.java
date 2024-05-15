public class Food {
    private double ratingTen;
    private int calories;
    private String name;

    public Food(double ratingTen, int calories, String name){
        this.ratingTen = ratingTen;
        this.calories = calories;
        this.name = name;
    }

    public int getCalories(){
        return calories;
    }

    public String getName(){
        return name;
    }

    public void eat(){
        System.out.println("Yum yum, munch mucnh.");
    }

    
}