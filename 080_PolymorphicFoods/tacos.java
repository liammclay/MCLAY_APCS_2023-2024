public class tacos extends Food{
    private String protien;

    public tacos(double ratingTen, int calories, String protien){
        super(ratingTen, calories);
        this.protien = protien;
    }

    public void describeTaco(){
        System.out.println("This is a "+protien+" taco.");
    }
}
