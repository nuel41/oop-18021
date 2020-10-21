package Bab89;

public class Kenyang {
     
     public void kenyang(){
        System.out.println("Perut Nuel sudah kenyang");
     }
     public void sudahMakan(int tambah){
         System.out.println("Karena ia sudah makan"+ tambah);
     }
     public static void main(String args[]){
         Kenyang perut = new Kenyang();
         perut.kenyang();
         perut.tambah(3);
     }
}
