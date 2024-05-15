package Week12;

public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedList DLL = new DoubleLinkedList();
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        DLL.addFirst(3);
        DLL.addLast(4);
        DLL.addFirst(7);
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        DLL.add(40, 1);
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        DLL.clear();
        DLL.print();
        System.out.println("Size : " + DLL.size());

        DLL.addLast(50);
        DLL.addLast(40);
        DLL.addLast(10);
        DLL.addLast(20);
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        DLL.removeFirst();
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        DLL.removeLast();
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        DLL.remove(1);
        DLL.print();
        System.out.println("Size : " + DLL.size());
    }
}
