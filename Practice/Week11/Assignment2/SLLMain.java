package Week11.Assignment2;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();

        // Create the linked list shown in the image
        linkedList.addFirst("e");
        linkedList.addFirst("d");
        linkedList.addFirst("c");
        linkedList.addFirst("b");
        linkedList.addFirst("a");

        // Print the linked list
        linkedList.print();

        // Adding additional elements using different methods
        linkedList.addLast("f");
        linkedList.insertAfter("b", "g");
        linkedList.insertAt(3, "h");

        // Print the linked list after insertions
        linkedList.print();

        // Remove elements and print the list
        linkedList.removeFirst();
        linkedList.print();
        
        linkedList.removeLast();
        linkedList.print();

        linkedList.remove("g");
        linkedList.print();

        linkedList.removeAt(2);
        linkedList.print();
    }
}
