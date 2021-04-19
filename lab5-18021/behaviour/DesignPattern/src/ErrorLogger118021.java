public class ErrorLogger118021 extends AbstractLogger118021 {
    public ErrorLogger118021(int Level){
        this.level = Level;
    }
    @Override
    protected void write(String message){
        System.out.println("Error Console::Logger: " + message);
    }
}
