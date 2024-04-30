public class Pizza extends Food{
    private String cheeseType;

    public Pizza(double ratingTen, int calories, String cheeseType){
        super(ratingTen, calories);
        this.cheeseType = cheeseType;
    }

    public void describePizza(){
        System.out.println("This is a pizza with "+cheeseType+" cheese.");
    }
}
