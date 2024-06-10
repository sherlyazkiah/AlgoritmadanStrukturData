package Week11.Assignment4;

public class CustomerLinkedList {
    Node head; // Initial position in linked list
    Node tail; // Last position in linked list

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Customer list:");
            while (tmp != null) {
                System.out.println("Name: " + tmp.name + ", Address: " + tmp.address + ", Account Number: " + tmp.customerAccountNumber);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Customer list is empty");
        }
    }

    public void addFirst(String name, String address, int customerAccountNumber) {
        Node newNode = new Node(name, address, customerAccountNumber, head);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(String name, String address, int customerAccountNumber) {
        Node newNode = new Node(name, address, customerAccountNumber, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAfter(int customerAccountNumber, String name, String address, int newCustomerAccountNumber) {
        Node newNode = new Node(name, address, newCustomerAccountNumber, null);
        Node temp = head;
        while (temp != null) {
            if (temp.customerAccountNumber == customerAccountNumber) {
                newNode.next = temp.next;
                temp.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
                break;
            }
            temp = temp.next;
        }
    }

    public void remove(int customerAccountNumber) {
        if (isEmpty()) {
            System.out.println("Customer list is empty. Cannot remove data.");
        } else {
            if (head.customerAccountNumber == customerAccountNumber) {
                head = head.next;
                if (head == null) {
                    tail = null;
                }
            } else {
                Node temp = head;
                while (temp.next != null && temp.next.customerAccountNumber != customerAccountNumber) {
                    temp = temp.next;
                }
                if (temp.next != null) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                }
            }
        }
    }
}
