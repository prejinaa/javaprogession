package org.example;

public class Main {

        public static void main(String[] args) {
            OrderQueue orderQueue = new OrderQueue();

            Waiter waiter1 = new Waiter(orderQueue);
            Waiter waiter2 = new Waiter(orderQueue);
            Chef chef1 = new Chef(orderQueue);
            Chef chef2 = new Chef(orderQueue);

            waiter1.start();
            waiter2.start();
            chef1.start();
            chef2.start();
        }
    }

