package org.stmi.oop.lab3;

import java.util.ArrayList; // Impor the ArrayList class    
import java.util.Collections; // Impor Kelas Koleksi
import java.util.HashMap; // Impor the HashMap class
import java.util.HashSet; // Impor kelas HashSet
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.function.Consumer;

interface StringFunction {
    String run(String str);
   }
public class MyClassBuka18021 {
    static void checkAge(int age) {
        if (age <18) {
        throw new ArithmeticException("Akses ditolak - Anda harus berusia minimal 18 tahun.");
        }
        else {
        System.out.println ("Akses diberikan - Anda cukup tua!");
            }
        }
    public static void main(String[]args){
        ArrayList<String> cars18MyClassBuka18021 = new ArrayList<String>();// Buat objek ArrayList
        cars18MyClassBuka18021.add("Volvo");
        cars18MyClassBuka18021.add("BMW");
        cars18MyClassBuka18021.add("Ford");
        cars18MyClassBuka18021.add("Mazda");
        System.out.println(cars18MyClassBuka18021);
        
        Collections.sort(cars18MyClassBuka18021); // Menyortir mobil
        for(String i: cars18MyClassBuka18021){
            System.out.println(i);
        }

        cars18MyClassBuka18021.get(0);
        cars18MyClassBuka18021.set(0,"Opel");
        cars18MyClassBuka18021.remove(0);
        cars18MyClassBuka18021.add(0, "Polo");
        cars18MyClassBuka18021.size();
         System.out.println(cars18MyClassBuka18021);

         for (int i =0; i<cars18MyClassBuka18021.size(); i++){
            System.out.println(cars18MyClassBuka18021.get (i));
        }

         for (String i: cars18MyClassBuka18021){
            System.out.println(i);
        }

        ArrayList<Integer> myNumbers18MyClassBuka18021 = new ArrayList<Integer>();
        myNumbers18MyClassBuka18021.add(10);
        myNumbers18MyClassBuka18021.add(15);
        myNumbers18MyClassBuka18021.add(20);
        myNumbers18MyClassBuka18021.add(25);
            for (int i: myNumbers18MyClassBuka18021){
                System.out.println(i);
            }

        Collections.sort(myNumbers18MyClassBuka18021);// Urutkan Nomor saya
            for(int i: myNumbers18MyClassBuka18021){
                System.out.println(i);
            }
        
        System.out.println(cars18MyClassBuka18021);

         // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities18MyClassBuka18021 = new HashMap<String, String>();
 
        // Add keys and values (Country, City)
        capitalCities18MyClassBuka18021.put("England", "London");
        capitalCities18MyClassBuka18021.put("Germany", "Berlin");
        capitalCities18MyClassBuka18021.put("Norway", "Oslo");
        capitalCities18MyClassBuka18021.put("USA", "Washington DC");
            System.out.println(capitalCities18MyClassBuka18021);
        
        capitalCities18MyClassBuka18021.get("England");
        capitalCities18MyClassBuka18021.size ();
            System.out.println(capitalCities18MyClassBuka18021);
        
        // Cetak kunci
        for (String i: capitalCities18MyClassBuka18021.keySet()) {
            System.out.println(i);
        }
        // Cetak nilai
        for (String i: capitalCities18MyClassBuka18021.values ()) {
            System.out.println (i);
        }
        // Cetak kunci dan nilai
        for (String i: capitalCities18MyClassBuka18021.keySet()) {
            System.out.println ("kunci:" + i + "nilai:" + capitalCities18MyClassBuka18021.get(i));
        }

        HashMap <String, Integer> people18MyClassBuka18021 = new HashMap <String, Integer> ();
        // Tambahkan kunci dan nilai (Nama, Usia)
        people18MyClassBuka18021.put("John", 32);
        people18MyClassBuka18021.put("Steve", 30);
        people18MyClassBuka18021.put("Angie", 33);
            for (String i: people18MyClassBuka18021.keySet ()) {
                System.out.println("kunci:" + i + "nilai:" + people18MyClassBuka18021.get(i));
            }
        
        HashSet<String> mobil18MyClassBuka18021 = new HashSet<String>();
        mobil18MyClassBuka18021.add("Volvo");
        mobil18MyClassBuka18021.add("BMW");
        mobil18MyClassBuka18021.add("Ford");
        mobil18MyClassBuka18021.add("BMW");
        mobil18MyClassBuka18021.add("Mazda");
            System.out.println(mobil18MyClassBuka18021);
        
        mobil18MyClassBuka18021.contains("Mazda");
        mobil18MyClassBuka18021.remove("Volvo");
        System.out.println(mobil18MyClassBuka18021);

        for (String i: mobil18MyClassBuka18021) {
            System.out.println(i);
        }

        // Buat objek HashSet yang disebut angka
        HashSet <Integer> angka18MyClassBuka18021 = new HashSet<Integer>();
        // Tambahkan nilai ke set
        angka18MyClassBuka18021.add (4);
        angka18MyClassBuka18021.add (7);
        angka18MyClassBuka18021.add (8);
        // Tunjukkan angka antara 1 dan 10 yang di set
        for (int i = 1; i <= 10; i ++) {
            if (angka18MyClassBuka18021.contains (i)) {
                System.out.println (i + "ditemukan di set.");
                    } else {
                        System.out.println (i + "tidak ditemukan di set.");
                    }
        }

        // Dapatkan Iteratornya
        Iterator<String> it18MyClassBuka18021 = cars18MyClassBuka18021.iterator();
        
        // Cetak item pertama
        System.out.println(it18MyClassBuka18021.next());
        while (it18MyClassBuka18021.hasNext()){
            System.out.println(it18MyClassBuka18021.next());
        }

        ArrayList<Integer> numbers18MyClassBuka18021 = new ArrayList<Integer>();
        numbers18MyClassBuka18021.add(12);
        numbers18MyClassBuka18021.add(8);
        numbers18MyClassBuka18021.add(2);
        numbers18MyClassBuka18021.add(23);
        
        Iterator<Integer> it118MyClassBuka18021 = numbers18MyClassBuka18021.iterator();
        while(it18MyClassBuka18021.hasNext()){
            Integer i = it118MyClassBuka18021.next();
            if (i<10){
                it118MyClassBuka18021.remove();
            }
        }
        System.out.println(numbers18MyClassBuka18021);

        Integer myInt18MyClassBuka18021 = 5;
        Double myDouble18MyClassBuka18021 = 5.99;
        Character myChar18MyClassBuka18021 = 'A';
        // System.out.println(myInt18MyClassBuka18021);
        // System.out.println(myDouble18MyClassBuka18021);
        // System.out.println(myChar18MyClassBuka18021);
        System.out.println(myInt18MyClassBuka18021.intValue());
        System.out.println(myDouble18MyClassBuka18021.doubleValue());
        System.out.println(myChar18MyClassBuka18021.charValue());

        Integer myInt = 100;
        String myString = myInt.toString();
        System.out.println(myString.length());

        //int[] myNumbers = {1,2,3};
        // System.out.println([10]);//Keselahan!
        // try{
            // Blok kode untuk dicoba
        //}
        // catch (Exception e){
            // blok kode untuk menangani kesalahan
        // }

        try{
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);
        }catch (Exception e){
            System.out.println("Ada yang tidak beres.");
        }
        // else {
            System.out.println("'Coba menangkap' selesai.");
        // }

        // checkAge(15); // Atur usia menjadi 15 (yaitu di bawah 18 ...)
        checkAge(20); //Atur usia menjadi 20

        Pattern pattern18MyClassBuka18021 = Pattern.compile("stmi", Pattern.CASE_INSENSITIVE);
        Matcher matcher18MyClassBuka18021 = pattern18MyClassBuka18021.matcher ("Kunjungi stmi!");
        boolean matchFound18MyClassBuka18021 = matcher18MyClassBuka18021.find();
        if (matchFound18MyClassBuka18021) {
            System.out.println("Cocok ditemukan");
        } else {
            System.out.println("pencarian tidak diketemukan");
        }
        
        numbers18MyClassBuka18021.add(5);
        numbers18MyClassBuka18021.add(9);
        numbers18MyClassBuka18021.add(8);
        numbers18MyClassBuka18021.add(1);
        numbers18MyClassBuka18021.forEach((n) -> {System.out.println(n);});

        Consumer<Integer> method = (n) -> { System.out.println(n); };
            numbers18MyClassBuka18021.forEach(method);
        
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
        }
        public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
        }
    }

/*
public class MyClassBuka18021 extends Thread {
 public static void main (String[] args) {
 MyClassBuka18021 thread = new MyClassBuka18021();
 thread.start ();
 System.out.println ("Kode ini di luar thread ");
 }
 public void run() {
 System.out.println ("Kode ini berjalan di thread ");
 }
}
*/
/*
public class MyClassBuka18021 implements Runnable {
 public static void main(String[] args) {
 MyClassBuka18021 obj = new MyClassBuka18021();
 Thread thread = new Thread(obj);
 thread.start();
 System.out.println("Kode ini di luar utas");
 }
 public void run() {
 System.out.println ("Kode ini berjalan di thread");
 }
}
*/
/*
public class MyClassBuka18021 extends Thread {
public static int amount = 0;
 public static void main(String [] args) {
 MyClassBuka18021 thread = new MyClassBuka18021();
 thread.start();
 System.out.println(amount);
 amount ++;
 System.out.println(amount);
 }
 public void run() {
 amount ++;
 }
}
*/
/*
public class MyClassBuka18021 extends Thread {
    public static int amount = 0;
     public static void main(String[] args) {
     MyClassBuka18021 thread = new MyClassBuka18021();
     thread.start();
     // Tunggu threadnya selesai
     while (thread.isAlive()) {
     System.out.println ("Menunggu ...");
     }
     // Perbarui jumlah dan cetak nilainya
     System.out.println("Utama:" + amount);
     amount++;
     System.out.println("Utama:" + amount);
     }
     public void run() {
     amount++;
     }
    }
*/



