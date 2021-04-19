public class ConsoleLogger118021 extends AbstractLogger118021 {
    public ConsoleLogger118021(int level){
        this.level = level;
    }
    @Override
    protected void write (String message){
        System.out.println("Standard Console::Logger: "+ message);
    }
}
