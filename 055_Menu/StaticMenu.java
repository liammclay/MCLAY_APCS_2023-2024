public class StaticMenu {
    public static void main(String[] args) {
        StaticMenuItem itemOne = new StaticMenuItem();
        StaticMenuItem itemTwo = new StaticMenuItem();
        StaticMenuItem itemThree = new StaticMenuItem();

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
// it didnt work because the variables were static, so when i updated them they were perminant across the class. so it affected the method.