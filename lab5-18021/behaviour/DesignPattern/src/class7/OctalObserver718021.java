package class7;

public class OctalObserver718021 extends Observer718021{
    public OctalObserver718021(Subject718021 subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update(){
        System.out.println("Octal String: "+ Integer.toOctalString(subject.getState()));
    }
}
