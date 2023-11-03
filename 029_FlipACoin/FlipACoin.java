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