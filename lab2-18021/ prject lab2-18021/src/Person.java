abstract class Person {
    public String fname = "John";
 public int age = 24;
 public abstract void study(); // metode abstrak
}
// Subclass (inherit from Person)
class Student extends Person {
 public int graduationYear = 2018;
 public void study() { //tubuh metode abstrak disediakan di sini
System.out.println("Studying all day long");
 }
}
// Akhiri kode dari nama file: Person.java
// Akhiri kode dari nama file: MyClass.java
class MyClass {
 public static void main(String[] args) {
 // membuat objek kelas Student (yang mewarisi atribut dan metode dari
 Student myObj = new Student();
 System.out.println("Name: " + myObj.fname);
 System.out.println("Age: " + myObj.age);
 System.out.println("Graduation Year: " + myObj.graduationYear);
 myObj.study(); // panggil metode abstrak
 }
}
