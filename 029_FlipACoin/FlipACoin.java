public class FlipACoin {
    public static void main(String[] args){
        int num = (int)((Math.random()+1)*10);
        int coin = num%2;


        if(coin == 0){
            System.out.println("heads");
        }
        else{
            System.out.println("tails");
        }
    }
    
}
/*
 * got a random int, and if it was odd i maid it print heads, els it would print tails
 */

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/