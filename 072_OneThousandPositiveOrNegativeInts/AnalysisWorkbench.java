import java.util.ArrayList;
public class AnalysisWorkbench {
    public static void main(String[] args) {
        OneThousandPositiveOrNegativeInts list = new OneThousandPositiveOrNegativeInts();
        PositiveNegativeAnalysis foo = new PositiveNegativeAnalysis();

        foo.allPositive(list.getList());
        foo.allNegative(list.getList());
        foo.sumPositive(list.getList());
        foo.sumNegative(list.getList());
    }
}
//I made an arraylist in OneThousandPos... class, thenmade methods analysis class that for arraylists.
//In this class I called the other two and used both of their methods.