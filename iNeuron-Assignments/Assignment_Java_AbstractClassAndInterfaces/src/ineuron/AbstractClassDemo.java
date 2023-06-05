//Demonstrate the difference between abstract class and interface by writing programs
//as well as in keypoints.

package ineuron;

abstract class Vehicle {
    public abstract void start();
    public abstract void stop();
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();
    }
}

