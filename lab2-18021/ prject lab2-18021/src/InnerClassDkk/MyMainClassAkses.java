package InnerClassDkk;

class OuterClassAkses {
    int x = 10;
    class InnerClassAkses {
        public int myInnerMethod() {
            return x;
        }
    }
}
public class MyMainClassAkses {
    public static void main(String[] args) {
        OuterClassAkses myOuter = new OuterClassAkses();
        OuterClassAkses.InnerClassAkses myInner = myOuter.new InnerClassAkses();
        System.out.println(myInner.myInnerMethod());
    }
}

