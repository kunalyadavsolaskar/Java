//Write a Java program that implements a producer-consumer model using
//multithreading. The program should have a producer thread that generates random
//numbers and adds them to a queue, and a consumer thread that reads numbers
//from the queue and calculates their sum. The program should use synchronization to
//ensure that the queue is accessed by only one thread at a time.
package ineuron;

import java.util.LinkedList;
import java.util.Queue;

public class MultiThreadingDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int maxSize = 10;

        Producer producer = new Producer(queue, maxSize);
        Consumer consumer = new Consumer(queue);

        producer.start();
        consumer.start();
    }
}
