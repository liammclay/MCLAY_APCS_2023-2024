public class NameTransmogrifier {
    String name;
    String nameReversed;
    String nameUpperCase;
    String nameLowerCase;
    int nameLength;
    String nameFirstLetter;
    String nameLastLetter;

    public NameTransmogrifier(String name) {
        this.name = name;
        nameUpperCase = name.toUpperCase();
        nameLowerCase = name.toLowerCase();
        StringBuilder stringBuilderForName = new StringBuilder(name);
        stringBuilderForName.reverse();
        nameReversed = stringBuilderForName.toString();
        stringBuilderForName.reverse();
        nameLength = stringBuilderForName.length();
        nameFirstLetter = stringBuilderForName.substring(0, 1);
        nameLastLetter = stringBuilderForName.substring(name.length()-1, name.length());
    }

    public static void main(String[] args) {
    }
}