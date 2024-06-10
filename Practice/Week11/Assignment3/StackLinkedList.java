package Week11.Assignment3;

public class StackLinkedList {
    private Node top; // Top of the stack

    public StackLinkedList() {
        top = null;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Push an element onto the stack
    public void push(String data) {
        Node newNode = new Node(data, top);
        top = newNode;
    }

    // Pop an element from the stack
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        } else {
            String data = top.data;
            top = top.next;
            return data;
        }
    }

    // Peek the top element of the stack
    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return null;
        } else {
            return top.data;
        }
    }

    // Print the stack
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            Node temp = top;
            System.out.println("Stack contents:");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
