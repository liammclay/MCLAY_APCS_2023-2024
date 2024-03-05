public class GasSign {
    
    public static GasPriceTracker gasOne = new GasPriceTracker("Unleaded", 2.49);
    public static GasPriceTracker gasTwo = new GasPriceTracker("Plus", 2.79);
    public static GasPriceTracker gasThree = new GasPriceTracker("Premium", 2.99);
    
    public static void main(String[] args) {

        gasOne.printInfo();
        gasTwo.printInfo();
        gasThree.printInfo();
        wholeSign();
        gasOne.setPrice(2.59);
        gasTwo.setPrice(2.89);
        gasThree.setPrice(3.09);
        wholeSign();
    }

    public static void wholeSign(){
        System.out.println("You look at the whole sign and see,");
        gasOne.printInfo();
        gasTwo.printInfo();
        gasThree.printInfo();
        System.out.println("");
    }
}
//gas prices are in abjects that are class variables.  I used the methods from GasPriceTracker in main, and the method whole sign I made.

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/