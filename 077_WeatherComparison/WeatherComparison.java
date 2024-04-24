public class WeatherComparison {
    public static void main(String[] args) {
        double[][] aprilWeather[5][6] =
        {{62.6, 53.9, 34.9, 43.1, 44.1},
        {36.9, 32.1, 43.8, 33.5, 33.7}, 
        {51.8, 49.9, 48.8, 52.8, 47.0},
        {21.6, 28.3, 27.6, 21.1, 28.6},
        {37.4, 39.1, 40.5, 38.3, 42.0},
        {45.4, 53.0, 29.6, 31.8, 43.2}};
    }

    public void avgAll(double[][] arr){
        double total = 0;
        int count = 0;

        for(int col = 0; col<arr[0].length; col++){
            for(int row = 0; row < arr.length; row++){
                total+= arr[row][col];
                count++;
            }
        }

        double avg = total/count;
        System.out.println("The average of all of the temps is, "+avg);
    }

    public void avgWeek(double[][] arr){
        for(int row = 0; row<arr.length; row++){
            double total = 0;
            int count = 0;
            double weekAvg = 0;
            int year = 2015;
            for(int col = 0; arr[row].length; col++){
                total += arr[row][col];
                count++;
            }
            weekAvg = total/count;
            System.out.println("The weeks average in "+year+" is "+weekAvg);
            year++;
        }
    }

    public void avgDay(double[][] arr){
        int[] avg = new int[arr[0].length];
        for (int col = 0;  col<arr[0].length; col++){
            double total = 0;
            int count = 0;
            for(int row = 0; row<arr.lngth; row++){
                total += arr[row][col];
                count++;
            }
            double average = total/count;
            avg[col] = average;
        }
        for(double days:avg){
            System.out.println();
        }
    }
}
