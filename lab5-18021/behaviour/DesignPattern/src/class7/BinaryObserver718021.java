package class7;

public class BinaryObserver718021 extends Observer718021{
    public BinaryObserver718021(Subject718021 subject){
        this.subject =  subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Binary String: "+ Integer.toBinaryString(subject.getState()));
    }
}
