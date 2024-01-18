import java.util.Scanner;
public class ZodiacCalculatorOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scan.nextLine();

        System.out.println("What year were you born in? ");
        int birthYear = scan.nextInt();

        zodiac(name, birthYear);
        
    }
    public static void zodiac(String name, int birthYear) {
        
        String zodiac = "";
        Boolean greaterThan2023 = false;
        Boolean lessThan1972 = false;

        if(birthYear == 1972 || birthYear == 1984 || birthYear == 1996 || birthYear == 2008 || birthYear == 2020){
            zodiac += "Rat";
        }
        else if(birthYear == 1973 || birthYear == 1985 || birthYear == 1997 || birthYear == 2009 || birthYear == 2021){
            zodiac += "Ox";
        }
        else if(birthYear == 1974 || birthYear == 1986 || birthYear == 1998 || birthYear == 2010 || birthYear == 2022){
            zodiac += "Tiger";
        }
        else if(birthYear == 1975 || birthYear == 1987 || birthYear == 1999 || birthYear == 2011 || birthYear == 2023){
            zodiac += "Rabbit";
        }
        else if(birthYear == 1976 || birthYear == 1988 || birthYear == 2000 || birthYear == 2012){
            zodiac += "Dragon";
        }
        else if(birthYear == 1977 || birthYear == 1989 || birthYear == 2001 || birthYear == 2013){
            zodiac += "Snake";
        }
        else if(birthYear == 1978 || birthYear == 1990 || birthYear == 2002 || birthYear == 2014){
            zodiac += "Horse";
        }
        else if(birthYear == 1979 || birthYear == 1991 || birthYear == 2003 || birthYear == 2015){
            zodiac += "Sheep";
        }
        else if(birthYear == 1980 || birthYear == 1992 || birthYear == 2004 || birthYear == 2016){
            zodiac += "Monkey";
        }
        else if(birthYear == 1981 || birthYear == 1993 || birthYear == 2005 || birthYear == 2017){
            zodiac += "Rooster";
        }
        else if(birthYear == 1982 || birthYear == 1994 || birthYear == 2006 || birthYear == 2018){
            zodiac += "Dog";
        }
        else if(birthYear == 1983 || birthYear == 1995 || birthYear == 2007 || birthYear == 2019){
            zodiac += "Pig";
        }
        else if(birthYear >2023){
            greaterThan2023 = true;
        }
        else if(birthYear<1972){
            lessThan1972 = true;
        }

        if(lessThan1972 == true){
            System.out.println(name+", your were born before 1972, so I dont know your zodiac sign.");
        }
        else if(greaterThan2023 == true){
            System.out.println(name+", you haven't been born yet.");
        }
        else{
            System.out.println(name+", your zodiac sign is the "+zodiac+", because you were born in "+birthYear+".");
        }

    }
}
//I made a method that would compare the users age to the zodiac signs, and print out their name and zodiac.


/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/