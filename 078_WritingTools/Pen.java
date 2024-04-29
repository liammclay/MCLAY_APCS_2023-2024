public class Pen extends WritingTool{

    private String penType;
    
    public Pen(boolean canWrite, String type, String penType){
        super(canWrite, type);
        this.penType = penType;
    }

    public void describe(){
        System.out.println("This is a "+penType+" pen.");
    }

}
