public class SingleObject318021 {
    private static SingleObject318021 instance = new SingleObject318021();
    private SingleObject318021(){}
    public static SingleObject318021 getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
   }
}