public class Pencil extends WritingTool{

    private String pencilType;

    public Pencil(boolean canWrite, String type, String pencilType){
        super(canWrite, type);
        this.pencilType = pencilType;
    }

    public void describePencil(){
        System.out.println("This is a "+pencilType+" pencil.");
    }
}
