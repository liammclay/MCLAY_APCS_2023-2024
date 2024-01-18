public class StaticShoeRack {
    public static void main(String[] args) {
        StaticShoes redNike = new StaticShoes();
        StaticShoes blueNike = new StaticShoes();
        StaticShoes redReebok = new StaticShoes();

        redNike.shoeBrand = "Nike";
        redNike.shoeColor = "red";
        redNike.shoeSize = 9;

        blueNike.shoeBrand = "Nike";
        blueNike.shoeColor = "blue";
        blueNike.shoeSize = 10;

        redReebok.shoeBrand = "Reebok";
        redReebok.shoeColor = "red";
        redReebok.shoeSize = 8;

        redNike.staticPrintShoe();
        blueNike.staticPrintShoe();
        redReebok.staticPrintShoe();
    }
}
//it didnt work because the variables were static so when i changed them for the last object it changed for every object. affecting the final print