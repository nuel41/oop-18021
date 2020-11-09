public class myClass18021 {

     // metode static
    static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
    }
    // Public method
    public void myPublicMethod() {
    System.out.println("Metode statis dapat dipanggil tanpa membuat objek ");
    }
    // Metode utama
    public static void main(String[ ] args) {
    LocalDateTime newww = LocalDateTime.now();
    System.out.println(newww);

    myStaticMethod(); // panggil metode static
    // myPublicMethod(); This would output an error
    myClass18021 myObj = new myClass18021(); // Buat objek MyClass
    myObj.myPublicMethod(); // panggil metode public
    }
}
