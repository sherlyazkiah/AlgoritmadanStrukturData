package Week11.Assignment4;

public class CustomerQueue {
    Node head; // Front of the queue
    Node tail; // End of the queue

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Customer queue:");
            while (tmp != null) {
                System.out.println("Name: " + tmp.name + ", Address: " + tmp.address + ", Account Number: " + tmp.customerAccountNumber);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Customer queue is empty");
        }
    }

    public void enqueue(String name, String address, int customerAccountNumber) {
        Node newNode = new Node(name, address, customerAccountNumber, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Customer queue is empty. Cannot dequeue.");
        } else {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }
}
