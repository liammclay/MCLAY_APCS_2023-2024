public class WeatherComparison {
    public static void main(String[] args) {
        WeatherComparison weather = new WeatherComparison();
        double[][] aprilWeather =
        {{62.6, 53.9, 34.9, 43.1, 44.1, 40.4, 39.7},
        {36.9, 32.1, 43.8, 33.5, 33.7, 38.1, 37.1},
        {51.8, 49.9, 48.8, 52.8, 47.0, 45.5, 47.5},
        {21.6, 28.3, 27.6, 21.1, 28.6, 19.0, 22.1},
        {37.4, 39.1, 40.5, 38.3, 42.0, 48.2, 55.7},
        {45.4, 53.0, 29.6, 31.8, 43.2, 50.7, 54.9}};

        weather.avgAll(aprilWeather);
        weather.avgWeek(aprilWeather);
        weather.avgDay(aprilWeather);
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
        System.out.println("The average of all of the temps is, "+avg+" degrees");
    }

    public void avgWeek(double[][] arr){
        int year = 2015;
        for(int row = 0; row<arr.length; row++){
            double total = 0;
            int count = 0;
            double weekAvg = 0;
            for(int col = 0; col< arr[row].length; col++){
                total += arr[row][col];
                count++;
            }
            weekAvg = total/count;
            System.out.println("The weeks average in "+year+" is "+weekAvg+" degrees");
            year++;
        }
    }

    public void avgDay(double[][] arr){
        double[] avg = new double[arr[0].length];
        for (int col = 0;  col<arr[0].length; col++){
            double total = 0;
            int count = 0;
            for(int row = 0; row<arr.length; row++){
                total += arr[row][col];
                count++;
            }
            double average = total/count;
            avg[col] = average;
        }
        System.out.println("These are the averages for each day over the 6 years:");
        for(double days:avg){
            System.out.println(days+" degrees");
        }
    }
}
//made a 2d array.  made methods that use nested for loops to find and print averages

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/