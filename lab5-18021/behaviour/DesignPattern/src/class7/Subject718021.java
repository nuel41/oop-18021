package class7;

import java.util.ArrayList;
import java.util.List;
public class Subject718021 {
    private List<Observer718021> observers = new ArrayList<Observer718021>();
    private int state;
    public int getState(){
        return state;
    }
    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }
    public void attach(Observer718021 observer){
        observers.add(observer);
    }
    public void notifyAllObservers(){
        for (Observer718021 observer : observers){
            observer.update();
        }
    }
}
