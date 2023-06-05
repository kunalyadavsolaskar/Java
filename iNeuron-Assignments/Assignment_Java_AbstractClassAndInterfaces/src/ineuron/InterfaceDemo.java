package ineuron;

interface Vehicle1 {
    void start();
    void stop();
}

class Truck implements Vehicle1 {
    @Override
    public void start() {
        System.out.println("Truck started");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Truck Truck = new Truck();
        Truck.start();
        Truck.stop();
    }
}
