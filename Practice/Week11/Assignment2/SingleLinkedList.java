package Week11.Assignment2;

public class SingleLinkedList {
    Node head; // Initial position in linked list
    Node tail; // Last position in linked list

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Linked list content: \t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list is empty");
        }
    }

    public void addFirst(String input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) { // if linked list is empty
            head = ndInput; // head and tail is equal with node input
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(String input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) { // if linked list is empty
            head = ndInput; // head and tail is equal with node input
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, String input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        }
    }

    public void insertAt(int index, String input) {
        if (index < 0) {
            System.out.println("Wrong index");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if (temp.next.next == null) tail = temp.next;
        }
    }

    public String getData(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int indexOf(String key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.equals(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove data");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove data");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove data");
        } else {
            Node temp = head;
            while (temp != null) {
                if ((temp.data.equals(key)) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.next.data.equals(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
