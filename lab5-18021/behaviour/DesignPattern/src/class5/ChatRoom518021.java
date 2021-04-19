package class5;

import java.util.Date;
public class ChatRoom518021 {
    public static void showMessage(User518021 user, String message){
        System.out.println(new Date().toString()+" ["+ user.getName()+ "] : "+ message);
    }
}
