package class7;

public class ObserverPatternDemo718021 {
    public static void main (String args []){
        Subject718021 subject = new Subject718021();

        new HexaObserver718021(subject);
        new OctalObserver718021(subject);
        new BinaryObserver718021(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 4");
        subject.setState(4);
    }
}
