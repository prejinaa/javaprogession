package org.example;

class Chef extends Thread {
    private final OrderQueue orderQueue;

    public Chef(OrderQueue orderQueue) {
        this.orderQueue = orderQueue;
    }

    public void run() {
        try {
            while (true) {
                String order = orderQueue.TakeOrder();
                processOrder(order);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void processOrder(String order) throws InterruptedException {
        System.out.println("Chef is preparing: " + order);
        Thread.sleep((int) (Math.random() * 1000));
        System.out.println("Chef completed: " + order);
    }
}
