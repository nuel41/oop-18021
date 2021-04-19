package class7;

public class HexaObserver718021 extends Observer718021 {
    public HexaObserver718021(Subject718021 subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update(){
        System.out.println("Hex String: "+ Integer.toHexString(subject.getState()).toUpperCase());
    }
}
