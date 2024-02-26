public class GasSign {
    public static void main(String[] args) {
        GasPriceTracker gasOne = new GasPriceTracker("Unleaded", 2.49);
        GasPriceTracker gasTwo = new GasPriceTracker("Plus", 2.79);
        GasPriceTracker gasThree = new GasPriceTracker("Premium", 2.99);

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
        gasOne.printInfo();
        gasTwo.printInfo();
        gasThree.printInfo();
    }
}
