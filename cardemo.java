// Program Title: Class "Car" with Methods
// Aim: To define a class Car with attributes like model, color and methods to start and stop the car.

class Car {
    // Step 2: Attributes
    String model;
    String color;

    // Step 3: Constructor to initialize values
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Step 4: start() method
    void start() {
        System.out.println(color + " " + model + " is starting...");
    }

    // Step 4: stop() method
    void stop() {
        System.out.println(color + " " + model + " has stopped.");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        // Step 5: Create object and invoke methods
        Car car1 = new Car("Tesla Model 3", "Red");
        car1.start();
        car1.stop();

        System.out.println();

        Car car2 = new Car("BMW X5", "Black");
        car2.start();
        car2.stop();
    }
}