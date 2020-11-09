package InnerClassDkk;
class OuterClassSt {
    int x = 10;
    static class InnerClassSt {
    int y = 5;
    }
   }
   public class MyMainClassStatic {
    public static void main(String[] args) {
    OuterClassSt.InnerClassSt myInner = new OuterClassSt.InnerClassSt();
    System.out.println(myInner.y);
    }
   }
   // Outputs 5