package Week11.Assignment4;

public class Node {
    String name;
    String address;
    int customerAccountNumber;
    Node next;

    public Node(String name, String address, int customerAccountNumber, Node next) {
        this.name = name;
        this.address = address;
        this.customerAccountNumber = customerAccountNumber;
        this.next = next;
    }
}
