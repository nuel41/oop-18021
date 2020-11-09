

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyClassInput {
 public static void main(String[] args) throws IOException  {
InputStreamReader  isr = new InputStreamReader (System.in);
BufferedReader myObj = new BufferedReader(isr);


System.out.println("Enter name, age and salary:");
 // String input
 String name = myObj.readLine();
 // Numerical input
 int age = myObj.read();
 String str = myObj.readLine();
 double salary = Double.parseDouble(str);
 // Output input by user
 System.out.println("Name: " + name);
 System.out.println("Age: " + age);
 System.out.println("Salary: " + salary);
 
 }
}