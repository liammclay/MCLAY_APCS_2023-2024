public class Tacos extends Food {
    private String protien;

    public Tacos(double ratingTen, int calories, String protien){
        super(ratingTen, calories);
        this.protien = protien;
    }

    public void describeTaco(){
        System.out.println("This is a "+protien+" taco.");
    }
}
