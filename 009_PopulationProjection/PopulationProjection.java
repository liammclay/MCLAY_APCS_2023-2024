public class PopulationProjection 
{
    public static void main(String[] args)
    {
        int year = 365;
        int numYears = 1;
        int dayInSeconds = 86400;
        
        int birth = year*numYears*(dayInSeconds/7);
        int death = year*numYears*(dayInSeconds/13);
        int immigrant = year*numYears*(dayInSeconds/45);
        int currentPop = 312032486;

        int futurePop = birth+immigrant-death+currentPop;

        System.out.println("in one years the population will be "+futurePop);

        numYears = 2;
        futurePop = birth+immigrant-death+futurePop;
        System.out.println("in two years the population will be "+futurePop);

        numYears = 3;
        futurePop = birth+immigrant-death+futurePop;
        System.out.println("in three years the population will be "+futurePop);

        numYears = 4;
        futurePop = birth+immigrant-death+futurePop;
        System.out.println("in four years the population will be "+futurePop);

        numYears = 5;
        futurePop = birth+immigrant-death+futurePop;
        System.out.println("in five years the population will be "+futurePop);
        
       
    }
}
/*made the parst of years numbers then i made the formula for pop. 
then i updated the vraibales before eavh string */
