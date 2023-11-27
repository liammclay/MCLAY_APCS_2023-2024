public class TabletopDice {
    public static void main(String[] args){

        int d4 = (int)(1 + (Math.random()*4));
        int d6 = (int)(1 + (Math.random()*6));
        int d8 = (int)(1 + (Math.random()*8));
        int d10 = (int)(1 + (Math.random()*10));
        int p10 = (int)(1 + (Math.random()*10));
        int d12 = (int)(1 + (Math.random()*12));
        int d20 = (int)(1 + (Math.random()*20));

        p10 = p10*10;

        System.out.println("d4, "+d4);
        System.out.println("d6, "+d6);
        System.out.println("d8, "+d8);
        System.out.println("d10, "+d10);
        System.out.println("perecntile is "+p10);
        System.out.println("d12, "+d12);
        System.out.println("d20, "+d20);
    }
}

/*
 * put random numbers in varaibles, then multiplied p10 by ten to get percentile
 * then printed.
 */

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/