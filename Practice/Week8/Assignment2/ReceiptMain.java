package Week8.Assignment2;

import java.util.Scanner;

public class ReceiptMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReceiptStack receiptStack = new ReceiptStack(8); // Dewi has 8 receipts
        char choice;

        do {
            System.out.println("1. Add receipt");
            System.out.println("2. Retrieve receipt");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Transaction ID: ");
                    String transactionId = scanner.nextLine();

                    System.out.print("Date: ");
                    String date = scanner.nextLine();

                    System.out.print("Quantity of items: ");
                    int quantity = scanner.nextInt();

                    System.out.print("Total price: ");
                    double totalPrice = scanner.nextDouble();

                    Receipt receipt = new Receipt(transactionId, date, quantity, totalPrice);
                    receiptStack.push(receipt);
                    break;

                case 2:
                    if (!receiptStack.isEmpty()) {
                        Receipt retrievedReceipt = receiptStack.pop();
                        System.out.println("Receipt retrieved:");
                        System.out.println(retrievedReceipt);
                    } else {
                        System.out.println("No receipts available.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }

            System.out.print("Do you want to continue (y/n)? ");
            choice = scanner.next().charAt(0);
            scanner.nextLine(); // Consume newline

        } while (Character.toLowerCase(choice) == 'y');

        scanner.close();
    }
}
