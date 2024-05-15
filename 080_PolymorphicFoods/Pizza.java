public class Pizza extends Food{
    private String cheeseType;

    public Pizza(double ratingTen, int calories, String name){
        super(ratingTen, calories, name);
        this.cheeseType = "Motzerella";
    }

    public void describePizza(){
        System.out.println("This is a pizza with "+cheeseType+" cheese.");
    }
}
