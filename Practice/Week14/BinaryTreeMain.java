package Week14;

import java.util.Scanner;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("a. Add");
            System.out.println("b. Delete");
            System.out.println("c. Find");
            System.out.println("d. Traverse InOrder");
            System.out.println("e. Traverse PreOrder");
            System.out.println("f. Traverse PostOrder");
            System.out.println("g. Exit");
            System.out.print("Choose an option: ");
            char option = sc.next().charAt(0);

            switch (option) {
                case 'a':
                    System.out.print("Enter value to add: ");
                    int valueToAdd = sc.nextInt();
                    bt.add(valueToAdd);
                    break;
                case 'b':
                    System.out.print("Enter value to delete: ");
                    int valueToDelete = sc.nextInt();
                    bt.delete(valueToDelete);
                    break;
                case 'c':
                    System.out.print("Enter value to find: ");
                    int valueToFind = sc.nextInt();
                    System.out.println("Found: " + bt.find(valueToFind));
                    break;
                case 'd':
                    bt.traverseInOrder(bt.root);
                    break;
                case 'e':
                    bt.traversePreOrder(bt.root);
                    break;
                case 'f':
                    bt.traversePostOrder(bt.root);
                    break;
                case 'g':
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        sc.close();
    }
}
