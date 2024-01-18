public class ShoeRack {
    public static void main(String[] args) {
        Shoes redNike = new Shoes();
        Shoes blueNike = new Shoes();
        Shoes redReebok = new Shoes();

        redNike.shoeBrand = "Nike";
        redNike.shoeColor = "red";
        redNike.shoeSize = 9;

        blueNike.shoeBrand = "Nike";
        blueNike.shoeColor = "blue";
        blueNike.shoeSize = 10;

        redReebok.shoeBrand = "Reebok";
        redReebok.shoeColor = "red";
        redReebok.shoeSize = 8;

        redNike.printShoe();
        blueNike.printShoe();
        redReebok.printShoe();
    }
}
// works because the variables being updated are not staic so the objects can be individualized