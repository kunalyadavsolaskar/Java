package ineuron;

import java.util.Queue;
import java.util.Random;

class Producer extends Thread {
    private Queue<Integer> queue;
    private int maxSize;

    public Producer(Queue<Integer> queue, int maxSize) {
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            synchronized (queue) {
                while (queue.size() == maxSize) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int num = random.nextInt(100);
                queue.add(num);
                System.out.println("Produced: " + num);
                queue.notifyAll();
            }
        }
    }
}
