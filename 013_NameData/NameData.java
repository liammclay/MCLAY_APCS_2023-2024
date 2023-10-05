public class NameData {
    public static void main(String[] args){
        NameTransmogrifier liam = new NameTransmogrifier("liam");

        System.out.println("my name is "+liam.name);
        System.out.println("my name reversed is "+liam.nameReversed);
        System.out.println("my name all upper case is "+liam.nameUpperCase);
        System.out.println("my name all lower case is "+liam.nameLowerCase);
        System.out.println("my name is "+liam.nameLength+" letters long");
        System.out.println("the first letter of my name is "+liam.nameFirstLetter);
        System.out.println("the last letter of my name is "+liam.nameLastLetter);
    }
}

