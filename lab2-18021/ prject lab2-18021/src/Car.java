public class Car {
    // Buat metode fullThrottle()
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    // Buat metode speed() dan tambahkan parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
    // Di dalam main, panggil metode pada objek myCar
    public static void main(String[] args) {
        Car myCar = new Car(); // Buat objek myCar
        myCar.fullThrottle(); // Panggil metode fullThrottle()
        myCar.speed(200); // Panggil metode speed()
    }    
}
