package Week11.Assignment3;

public class StackMain {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        // Push elements onto the stack
        stack.push("Multimedia");
        stack.push("Statistika");
        stack.push("Algoritma");
        stack.push("Matematika");
        stack.push("Basis Data");
        stack.push("Komputer");
        stack.push("Android");
        stack.push("Bahasa");

        // Print stack contents
        stack.print();

        // Pop an element from the stack
        System.out.println("Popped: " + stack.pop());

        // Print stack contents
        stack.print();

        // Peek the top element
        System.out.println("Top element: " + stack.peek());

        // Print stack contents
        stack.print();
    }
}
