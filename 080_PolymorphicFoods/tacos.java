public class tacos extends Food{
    public class Tacos extends Food {
        private String protien;
    
        public Tacos(double ratingTen, int calories, String name){
            super(ratingTen, calories, name);
            this.protien = "pork";
        }
    
        public void describeTaco(){
            System.out.println("This is a "+protien+" taco.");
        }
    }
    
}
