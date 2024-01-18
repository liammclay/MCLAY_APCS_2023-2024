public class Menu {
    public static void main(String[] args) {
        MenuItem itemOne = new MenuItem();
        MenuItem itemTwo = new MenuItem();
        MenuItem itemThree = new MenuItem();

        itemOne.itemName = "Pasta";
        itemOne.itemDescription = "Noodles with red sauce and meatballs";
        itemTwo.itemName = "pizza";
        itemTwo.itemDescription = "It's just peperoni pizza";
        itemThree.itemName = "Salad";
        itemThree.itemDescription = "Ceaser salad with crutons and parmasian cheese";

        itemOne.printItem();
        itemTwo.printItem();
        itemThree.printItem();
    }
}

