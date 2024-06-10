package Week11.Assignment4;

public class CustomerMain {
    public static void main(String[] args) {
        CustomerLinkedList customerList = new CustomerLinkedList();

        // Adding customers
        customerList.addFirst("Alice", "123 Main St", 1001);
        customerList.addLast("Bob", "456 Elm St", 1002);
        customerList.addLast("Charlie", "789 Oak St", 1003);
        customerList.print();

        // Insert a customer after a specific account number
        customerList.insertAfter(1002, "Diana", "101 Pine St", 1004);
        customerList.print();

        // Remove a customer by account number
        customerList.remove(1001);
        customerList.print();

        customerList.remove(1003);
        customerList.print();
    }
}
