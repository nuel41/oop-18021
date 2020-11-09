package org.stmi.oop.lab3;

/*
import java.util.ArrayList;
// import java.util.Collections; // Impor kelas Koleks
// import java.util.LinkedList;
// import java.util.HashMap; // Import the HashMap class
// import java.util.HashSet;
// import java.util.Iterator;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;
// import java.util.function.Consumer;
public class MyClass18021 {
 public static void main(String[] args) {
 ArrayList<String> cars18021 = new ArrayList<String>();
 cars18021.add("Volvo");
 cars18021.add("BMW");
 cars18021.add("Ford");
 cars18021.add("Mazda");
 //cars18021.get(2);

 cars18021.set(2, "Suzuki");
 cars18021.remove(2);
 cars18021.clear();
 cars18021.size();
 System.out.println(cars18021);
 }
}

*/

/*
public class MyClass18021 {
    public static void main (String[] args) {
        ArrayList<String> cars18021 = new ArrayList<String>();
        cars18021.add ("Volvo");
        cars18021.add ("BMW");
        cars18021.add("Ford");
        cars18021.add("Mazda");
        for (int i = 0; i <cars18021.size(); i ++) {
            System.out.println (cars18021.get (i));
        }
    }
}*/

//Array size dengan for each
/*
public class MyClass18021 {
    public static void main (String [] args) {
        ArrayList<String> cars18021 = new ArrayList<String>();
        cars18021.add("Volvo");
        cars18021.add("BMW");
        cars18021.add("Ford");
        cars18021.add("Mazda");
        for (String i: cars18021) {
            System.out.println (i);
        }
    }
}*/

   //Tipe int
   /*
   import java.util.ArrayList;
   public class MyClass18021 {
    public static void main (String [] args) {
        ArrayList<Integer> myNumbers18021 = new ArrayList<Integer>();
        myNumbers18021.add(10);
        myNumbers18021.add(15);
        myNumbers18021.add(20);
        myNumbers18021.add(25);
        for (int i: myNumbers18021) {
            System.out.println(i);
        }
    }
}*/
   
//Sortir Array
/*
import java.util.ArrayList;
import java.util.Collections; // Impor kelas Koleksi
public class MyClass18021 {
    public static void main(String[] args) {
        ArrayList<String> cars18021 = new ArrayList <String> ();
        cars18021.add("Volvo");
        cars18021.add("BMW");
        cars18021.add("Ford");
        cars18021.add("Mazda");
        Collections.sort(cars18021); // Menyortir mobil
        for (String i: cars18021) {
            System.out.println (i);
        }
    }
}
*/

//Sortir Array Int
/*
import java.util.ArrayList;
import java.util.Collections; // Impor kelas Koleksi
    public class MyClass18021 {
        public static void main(String[] args) {
        ArrayList<Integer> myNumbers18021 = new ArrayList<Integer> ();
        myNumbers18021.add(33);
        myNumbers18021.add(15);
        myNumbers18021.add(20);
        myNumbers18021.add(34);
        myNumbers18021.add(8);
        myNumbers18021.add(12);
        Collections.sort (myNumbers18021); // Urutkan nomor saya
        for (int i: myNumbers18021) {
            System.out.println (i);
        }
    }
}
*/

/*
import java.util.LinkedList; // Import the LinkedList class
public class MyClass18021 {
    public static void main(String[] args) {
    LinkedList<String> cars18021 = new LinkedList<String>();
    cars18021.add("Volvo");
    cars18021.add interface StringFunction {
        String run(String str);
    }
*/
/*
public class MyClass18021 {
    public static void main(String[] args) {
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
    ("BMW");
    cars18021.add("Ford");
    cars18021.add("Mazda");
    System.out.println(cars18021);
    }
}*/

/*
import java.util.HashMap; // Import the HashMap class
public class MyClass18021 {
    public static void main(String[] args) {
     // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities18021 = new HashMap<String, String>();
        // Add keys and values (Country, City)
        capitalCities18021.put("England", "London");
        capitalCities18021.put("Germany", "Berlin");
        capitalCities18021.put("Norway", "Oslo");
        capitalCities18021.put("USA", "Washington DC");
        System.out.println(capitalCities18021);
        }
    }*/

/*
import java.util.HashMap; // Import the HashMap class
public class MyClass18021 {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities18021 = new HashMap<String, String>();
        // Add keys and values (Country, City)
        capitalCities18021.put("England", "London");
        capitalCities18021.put("Germany", "Berlin");
        capitalCities18021.put("Norway", "Oslo");
        capitalCities18021.put("USA", "Washington DC");
        /* // Cetak nilai
        for (String i: capitalCities18021.values ()) {
            System.out.println (i);
        }
        for (String i: capitalCities18021.keySet ()) {
            System.out.println(i);

        //Cetak nilai dan kunci
        /*
            System.out.println(i + "nilai:" + capitalCities18021.get(i));*/   
            /*
        } 
    }
}*/
/*
// Impor kelas HashMap
import java.util.HashMap;
public class MyClass18021 {
    public static void main(String[] args) {
        HashMap <String, Integer> people18021 = new HashMap <String, Integer> ();
        people18021.put("John", 32);
        people18021.put("Steve", 30);
        people18021.put("Angie", 33);
        for (String i: people18021.keySet ()) {
        System.out.println("kunci:" + i + "nilai:" + people.get(i));
        }
    }
}
*/

/*
// Impor kelas HashSet
import java.util.HashSet;
public class MyClass18021 {
    public static void main(String[] args) {
        HashSet <String> car18021 = HashSet new <String> ();
        cars18021.add("Volvo");
        cars18021.add("BMW");
        cars18021.add("Ford");
        cars18021.add("BMW");
        cars18021.add("Mazda");
        System.out.println (car18021);
        //Menggunakan Loop
        for (String i: cars18021) {
            System.out.println(i);
        }
    }
}
 */

/*
import java.util.HashSet;
public class MyClass18021 {
    public static void main (String [] args) {
        // Buat objek HashSet yang disebut angka
        HashSet <Integer> number18021 = HashSet new <Integer> ();
        // Tambahkan nilai ke set
        numbers18021.add (4);
        numbers18021.add (7);
        numbers18021.add (8);
        // Tunjukkan angka antara 1 dan 10 yang di set
        for (int i = 1; i <= 10; i ++) {
            if (numbers18021.contains (i)) {
                System.out.println (i + "ditemukan di set.");
            } else {
                System.out.println (i + "tidak ditemukan di set.");
            }
        }
    }
}*/

/*
// Impor kelas ArrayList dan kelas Iterator
import java.util.ArrayList;
import java.util.Iterator;
public class MyClass18021 {
    public static void main(String[] args) {
    // Buatlah koleksi
        ArrayList<String> cars18021 = new ArrayList<String> ();
        cars18021.add("Volvo");
        cars18021.add("BMW");
        cars18021.add("Ford");
        cars18021.add("Mazda");
        // Dapatkan iteratornya
        Iterator<String> it = cars18021.iterator ();
        // Cetak item pertama
        //System.out.println (it.next ());
        //Untuk LOOP
        while (it.hasNext()) {
            System.out.println (it.next());
        }

    }
} */

//Menghapus Item
/*
import java.util.ArrayList;
import java.util.Iterator;
public class MyClass18021 {
    public static void main (String[] args) {
        ArrayList<Integer> numbers18021 = new ArrayList<Integer>();
        numbers18021.add(12);
        numbers18021.add(8);
        numbers18021.add(2);
        numbers18021.add(23);
        Iterator<Integer> it = numbers18021.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if (i <10) {
                it.remove();
            }
        }
        System.out.println(numbers18021);
    }
}*/

/*
public class MyClass18021 {
    public static void main(String[] args) {
        Integer myInt18021 = 5;
        Double myDouble18021 = 5,99;
        Karakter myChar18021 = 'A';
        System.out.println(myInt18021);
        System.out.println(myDouble18021);
        System.out.println(myChar18021);
    }
} */

/*
public class MyClass18021 {
    public static void main(String[] args) {
        Integer myInt18021 = 5;
        Double myDouble18021 = 5,99;
        Karakter myChar18021 = 'A';
        System.out.println (myInt18021.intValue());
        System.out.println (myDouble18021.doubleValue());
        System.out.println (myChar18021.charValue());
    }
} */

//Contoh String
/*
public class MyClass18021 {
    public static void main (String[] args) {
    Integer myInt18021 = 100;
    String myString18021 = myInt18021.toString();
    System.out.println (myString18021.length());
    }
}*/


/*
public class MyClass18021 {
    public static void main(String[] args) {
        int[] myNumbers18021 = {1, 2, 3};
        System.out.println(myNumbers18021 [10]); // kesalahan!
        //System.out.println(myNumbers18021 [1]) // Benar
    }
   }*/
/*
public class MyClass18021 {
    public static void main(String [] args) {
        try
        {
            int [] myNumbers18021 = {1, 2, 3};
            System.out.println(myNumbers18021 [10]);
        } catch (Exception e) {
            System.out.println("Ada yang tidak beres.");
        }
    }
} */

/*
public class MyClass18021 {
    public static void main(String[] args) {
        try {
            int[] myNumbers18021 = {1, 2, 3};
            System.out.println(myNumbers18021 [10]);
        } catch (Exception e) {
            System.out.println("Ada yang tidak beres.");
            } else {
                System.out.println("'Coba menangkap' selesai.");
            }
        }
} */

//Throw Exception
/*
public class MyClass18021 {
    static void checkAge18021(int age) {
    if (age <18) {
        throw new ArithmeticException("Akses ditolak - Anda harus berusia minimal 18 tahun.");
        }
    else {
        System.out.println ("Akses diberikan - Anda cukup tua!");
    }
    }
    public static void main(String[] args) {
        checkAge18021(15); // Atur usia menjadi 15 (yaitu di bawah 18 ...)
        //checkAge(20); //Aturan Benar
    }
   }*/

/*
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MyClass18021 {
 public static void main(String[] args) {
    Pattern pattern18021 = Pattern.compile("stmi", Pattern.CASE_INSENSITIVE);
    Matcher matcher18021 = pattern18021.matcher ("Kunjungi stmi!");
    boolean matchFound = matcher18021.find();
    if (matchFound) 
    {
        System.out.println("Cocok ditemukan");
    } else {
        System.out.println("pencarian tidak diketemukan");
        }
    }
}*/

/*
public class MyClass18021 extends Thread18021 {
    public void run()
    {
        System.out.println ("Kode ini berjalan di utas");
    }
}*/

/*
public class MyClass18021 implements Runnable18021 {
    public void run() {
        System.out.println ("Kode ini berjalan di utas");
    }
} */

/*
public class MyClass18021 extends Thread18021 {
    public static void main (String[] args) {
        MyClass thread18021 = new MyClass();
        thread18021.start ();
        System.out.println ("Kode ini di luar thread ");
        }
    public void run() {
    System.out.println ("Kode ini berjalan di thread ");
    }
} */


/*
public class MyClass18021 extends Thread18021 {
    public static int amount = 0;
    public static void main(String [] args) {
        MyClass18021 thread18021 = new MyClass18021();
        thread18021.start();
        System.out.println(amount);
        amount ++;
        System.out.println(amount);
        }
    public void run() {
    amount ++;
    }
    }*/

//Is Alive
/*
public class MyClass18021 extends Thread18021 {
    public int amount = 0;
        public static void main(String[] args) {
            Thread18021 MyClass18021 = new MyClass18021();
            thread18021.start();
            // Tunggu threadnya selesai
            while (thread18021.isAlive()) {
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
    }*/

//Nomor 10 Lambda
/*
import java.util.ArrayList;
public class MyClass18021 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers18021 = new ArrayList<Integer> ();
        numbers18021.add(5);
        numbers18021.add(9);
        numbers18021.add(8);
        numbers18021.add(1);
        numbers18021.forEach((n) -> {System.out.println(n);});
    }
}*/

//Lambda Parameter
/*
interface StringFunction {
    String run(String str);
   }
   public class MyClass18021 {
        public static void main(String[] args) {
        StringFunction exclaim18021 = (s) -> s + "!";
        StringFunction ask18021 = (s) -> s + "?";
        printFormatted("Hello", exclaim18021);
        printFormatted("Hello", ask18021);
    }
    public static void printFormatted(String str, StringFunction format) {
    String result = format.run(str);
    System.out.println(result);
    }
   }*/

/*

//Contoh Dari Dosen


import java.util.ArrayList;
import java.util.Collections; // Impor kelas Koleksi
public class MyClass18021 {
    public static void main(String[] args) {
        /* Kode sebelumnya di comment , untuk semua pekerjaan bila masih dengan
        nama kelas yang sama */
        // ArrayList<String> cars18021 = new ArrayList<String>();
        // cars18021.add("Volvo");
        // cars18021.add("BMW");
        // cars18021.add("Ford");
        // cars18021.add("Mazda");
        // System.out.println(cars18021);
        // }
    /*
    ArrayList<String> cars18021 = new ArrayList <String> ();
    cars18021.add("Volvo");
    cars18021.add("BMW");
    cars18021.add("Ford");
    cars18021.add("Mazda");
    Collections.sort(cars18021); // Menyortir mobil
    for (String i: cars18021) {
        System.out.println (i);
    }
 }
}*/