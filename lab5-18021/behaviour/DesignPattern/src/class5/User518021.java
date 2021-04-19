package class5;

public class User518021 {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public User518021(String name){
        this.name = name;
    }
    public void sendMessage(String message){
        ChatRoom518021.showMessage(this,message);
    }
}
