package InnerClassDkk;
class OuterClassPriv {
    int x = 10;   
    private class InnerClassPriv {
    int y = 5;
    }
   }
   public class MyMainClassPriv {
    public static void main(String[] args) {
    OuterClassPriv myOuter = new OuterClassPriv();
    OuterClassPriv.InnerClassPriv myInner = myOuter.new InnerClassPriv();
    System.out.println(myInner.y + myOuter.x);
    }
   }