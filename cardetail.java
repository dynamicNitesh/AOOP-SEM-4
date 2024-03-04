//exp 19
public class cardetail{
    public static void main(String[] args) {
        // Create 5 instances of Car class
        Car car1 = new Car("Toyota", 180);
        Car car2 = new Car("BMW", 220);
        Car car3 = new Car("Honda", 200);
        Car car4 = new Car("Ford", 190);
        Car car5 = new Car("Tesla", 250);

        // Print the instances
        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
        System.out.println("Car 3: " + car3);
        System.out.println("Car 4: " + car4);
        System.out.println("Car 5: " + car5);
    }
}

class Car {
    private int topSpeed;
    private String name;

    // Constructor
    public Car(String name, int topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
    }
    public String toString() {
        return "Car Name: " + name + ", Top Speed: " + topSpeed + " km/h";
    }
}
