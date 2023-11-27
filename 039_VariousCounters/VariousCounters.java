public class VariousCounters {
    public static void main(String[] args) {
        int start1 = 0;
        int start2 = 103436;
        int start3 = 1000;
        
        System.out.println("This is every even number between 0 and 100.");

        while(start1<=100){
            if(start1%2 == 0){
                System.out.println(start1);
                start1++;
            }
            else{
                start1++;
            }
        }
        
        System.out.println("This si every number divisible by 76 between 103,436 and 2,000,007.");

        while(start2<=2000007){
            if(start2%76 == 0){
                System.out.println(start2);
                start2++;
            }
            else{
                start2++;
            }
        }
        
        System.out.println("These are the numbers between 1,000 and 2,000 following the pattern +7,-3,+11,-2.");

        while(start3<=2000){
            System.out.println(start3);
            start3 = start3+7;
            System.out.println(start3);
            start3 = start3-3;
            System.out.println(start3);
            start3 = start3+11;
            System.out.println(start3);
            start3 = start3-2;
        }
        
    }
}
/*
 * used while loops to print out specific counters using if statements
 */