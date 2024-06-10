package Week11.Assignment4;

public class CustomerQueueLLMain {
    public static void main(String[] args) {
        CustomerQueue customerQueue = new CustomerQueue();

        // Enqueue customers
        customerQueue.enqueue("Alice", "123 Main St", 1001);
        customerQueue.enqueue("Bob", "456 Elm St", 1002);
        customerQueue.enqueue("Charlie", "789 Oak St", 1003);
        customerQueue.print();

        // Dequeue a customer
        customerQueue.dequeue();
        customerQueue.print();

        // Dequeue another customer
        customerQueue.dequeue();
        customerQueue.print();

        // Enqueue another customer
        customerQueue.enqueue("Diana", "101 Pine St", 1004);
        customerQueue.print();
    }
}
