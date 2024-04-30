public class Table {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(9.0, 1000, "motzeralla");
        Tacos taco = new Tacos(6.0, 700, "pork");

        pizza.describePizza();
        pizza.eat();

        taco.describeTaco();
        taco.eat();
    }
    
}
