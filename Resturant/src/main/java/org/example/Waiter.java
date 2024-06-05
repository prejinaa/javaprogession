package org.example;

import java.time.Duration;

public class Waiter extends Thread {
    private final OrderQueue orderQueue;
    private final String[] order={"burger","pizza","momo","susees"};


    public Waiter(OrderQueue orderQueue) {
        this.orderQueue = orderQueue;
    }
    public void run() {
        try {
            for (int i = 0; i < order.length; i++) {
                orderQueue.PlaceOrder(order[i]);
                Thread.sleep(Duration.ofMillis(20000));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
