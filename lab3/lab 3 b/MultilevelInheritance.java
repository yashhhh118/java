class Vehicle {
    String brand = "Ford";
    public void msg() {
        System.out.println("method form vehicle class");
    }
}

class Car extends Vehicle {
    String model = "Mustang";
    public void drive() {
        System.out.println("The car is driving.");
    }
}

class SportsCar extends Car {
    int maxSpeed = 300;

    
}

public class MultilevelInheritance{
 public static void main(String[] args) {
        SportsCar mySportsCar = new SportsCar();
        
        mySportsCar.msg();         // Inherited from Vehicle
        mySportsCar.drive();        // Inherited from Car
        System.out.println(mySportsCar.brand + " " + mySportsCar.model + " " + mySportsCar.maxSpeed);
    }   
}