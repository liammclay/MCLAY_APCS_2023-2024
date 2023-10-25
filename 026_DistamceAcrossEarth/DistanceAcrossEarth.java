import java.util.Scanner;
public class DistanceAcrossEarth{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
       
        System.out.print("What is the latitude of point one?(decimal pls) ");
        double lat1 = scan.nextDouble();
        
        System.out.print("What is the longitude of point one?(decimal pls) ");
        double lon1 = scan.nextDouble();
       
        System.out.print("What is the latitude of point one?(decimal pls) ");
        double lat2 = scan.nextDouble();
        
        System.out.print("What is the longitude of point one?(decimal pls) ");
        double lon2 = scan.nextDouble();
        
        double a = Math.pow(Math.sin((lat2-lat1)/2),2)+Math.cos(lat1)*Math.cos(lat2)*Math.pow(Math.sin((lon2-lon1)/2),2);

        double c = 2*a*Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

        double distance = 6400*c;

        System.out.println("the distance is "+distance+"km");
        
    }
}