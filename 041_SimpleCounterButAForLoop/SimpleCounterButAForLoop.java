public class SimpleCounterButAForLoop {
    public static void main(String[] args) {
        System.out.println("counting up to 300: ");
        for(int i=0; i<=300; i++){
            System.out.println(i);
        }

        System.out.println("counting down from 300:");
        for(int i=300; i>=0; i--){
            System.out.println(i);
        }

        System.out.println("numbers between 4798 and 5324:");
        for(int i=4798; i<=5324; i++){
            System.out.println(i);
        }

        System.out.println("counting down from 5324 to 4798:");
        for(int i=5324; i>=4798; i--){
            System.out.println(i);
        }
    }
}