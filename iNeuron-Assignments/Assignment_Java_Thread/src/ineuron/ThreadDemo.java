//Write a Java program that creates two threads. The first thread should print even
//numbers between 1 and 10, and the second thread should print odd numbers
//between 1 and 10.

package ineuron;

class EvenThread extends Thread {
    @Override
    public void run() {
        System.out.println("Even numbers:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}

class OddThread extends Thread {
    @Override
    public void run() {
        System.out.println("Odd numbers:");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();
        oddThread.start();
    }
}
