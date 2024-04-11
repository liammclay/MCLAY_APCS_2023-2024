import java.util.ArrayList;
public class OneThousandPositiveOrNegativeInts {
    public ArrayList<Integer> thousand = new ArrayList<Integer>();

    public OneThousandPositiveOrNegativeInts(){
        for(int i=1; i<=1000; i++){
            int num = (int)(Math.random()*2001);
            if(num>1000){
                num = num-2000;
                thousand.add(num);
            }
            else{
                thousand.add(num);
            }
        }
    }

    public ArrayList<Integer> getList(){
        return thousand;
    }
}
