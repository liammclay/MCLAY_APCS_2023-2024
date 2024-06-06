public class Desk {
    public static void main(String[] args) {
        Pen pen1 = new Pen(true, "pen", "clicky");
        Pencil pencil1 = new Pencil(false, "pencil", "wood");

        pen1.describe();
        pen1.write();

        pencil1.describePencil();
        pencil1.write();
    }
}
//made parent class writing tool
//pen and pencil extend writingtool and have extra methods and variables
//desk uses the methods from each

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/