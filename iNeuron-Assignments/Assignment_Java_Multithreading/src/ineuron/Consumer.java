package ineuron;

import java.util.Queue;

class Consumer extends Thread {
    private Queue<Integer> queue;

    public Consumer(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int num = queue.poll();
                System.out.println("Consumed: " + num);
                int sum = calculateSum(queue);
                System.out.println("Sum: " + sum);
                queue.notifyAll();
            }
        }
    }

    private int calculateSum(Queue<Integer> queue) {
        int sum = 0;
        for (int num : queue) {
            sum += num;
        }
        return sum;
    }
}