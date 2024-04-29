public class WritingTool {
    public boolean canWrite;
    public String type;

    public WritingTool(boolean canWrite, String type){
        this.canWrite = canWrite;
        this.type = type;
    }

    public void write(){
        if(canWrite == true){
            System.out.println("The "+type+" starts writing.");
        }
        else{
            System.out.println("The "+type+" can't write.");
        }
    }
}
