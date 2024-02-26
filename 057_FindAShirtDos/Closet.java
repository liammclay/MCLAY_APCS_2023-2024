public class Closet {
    public static void main(String[] args) {
        Shirt shirtOne = new Shirt();
        Shirt shirtTwo = new Shirt("red", "nike", "long sleeved", false);
        Shirt shirtThree = new Shirt("green", "Market", "long sleeved", true);
        Shirt shirtFour = new Shirt("gray", "nike", "T-shirt", true);

        shirtOne.fold();
        shirtOne.selfDescription();
        shirtOne.cleanStatus(true);

        shirtTwo.fold();
        shirtTwo.selfDescription();
        shirtTwo.cleanStatus(true);

        shirtThree.fold();
        shirtThree.selfDescription();
        shirtThree.cleanStatus(true);

        shirtFour.fold();
        shirtFour.selfDescription();
        shirtFour.cleanStatus(true);
    }
}
//made objects with constructors and used methods from shirt java

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/