public class FileLogger118021 extends AbstractLogger118021{
    public FileLogger118021(int level){
        this.level = level;
    }
    @Override
    protected void write(String message){
        System.out.println("File::Logger: "+message);
    }
}
