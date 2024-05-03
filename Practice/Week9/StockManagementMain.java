package Week9;

import java.util.Scanner;

public class StockManagementMain {
    public static void main(String[] args) {
        StockManagement stockManagement = new StockManagement();
        Scanner scanner = new Scanner(System.in);

        // Adding initial items
        stockManagement.addItem(new Item(16030927, "Indomilk", "drink", 100));
        stockManagement.addItem(new Item(16100617, "Sprite", "drink", 70));
        stockManagement.addItem(new Item(16240401, "Yakult", "drink", 500));
        stockManagement.addItem(new Item(16270525, "Indomie", "food", 250));
        stockManagement.addItem(new Item(16971204, "Oreo", "food", 320));
        stockManagement.addItem(new Item(16100727, "Chocochips", "food", 120));
        stockManagement.addItem(new Item(16460329, "Ballpoint", "stationary", 75));
        stockManagement.addItem(new Item(16320421, "Pencil", "stationary", 110));
        stockManagement.addItem(new Item(16180729, "Book", "stationary", 57));

        // Menu loop
        boolean exit = false;
        while (!exit) {
            System.out.println("\nStock Management System Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Display All Items");
            System.out.println("3. Sort Items by Stock");
            System.out.println("4. Display Food Items with No Stock");
            System.out.println("5. Search Item by Name");
            System.out.println("6. Add Stock for Item");
            System.out.println("7. Decrease Stock for Item");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter item details:");
                    System.out.print("Item Code: ");
                    int itemCode = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Category: ");
                    String category = scanner.nextLine();
                    System.out.print("Stock: ");
                    int stock = scanner.nextInt();
                    scanner.nextLine(); 

                    stockManagement.addItem(new Item(itemCode, name, category, stock));
                    System.out.println("Item added successfully!");
                    break;
                case 2:
                    System.out.println("Displaying all items:");
                    stockManagement.displayAllItems();
                    break;
                case 3:
                    System.out.println("Sorting items by stock:");
                    stockManagement.sortItemsByStock();
                    stockManagement.displayAllItems();
                    break;
                case 4:
                    System.out.println("Displaying food items with no stock:");
                    stockManagement.displayFoodItemsWithNoStock();
                    break;
                case 5:
                    System.out.print("Enter item name: ");
                    String keyword = scanner.nextLine();
                    System.out.println("Searching for items with name '" + keyword + "':");
                    stockManagement.searchItemByName(keyword);
                    break;
                case 6:
                    System.out.print("Enter item code to add stock: ");
                    int codeToAddStock = scanner.nextInt();
                    System.out.print("Enter quantity to add: ");
                    int quantityToAdd = scanner.nextInt();
                    stockManagement.addStock(codeToAddStock, quantityToAdd);
                    System.out.println("Stock added successfully!");
                    break;
                case 7:
                    System.out.print("Enter item code to decrease stock: ");
                    int codeToDecreaseStock = scanner.nextInt();
                    System.out.print("Enter quantity to decrease: ");
                    int quantityToDecrease = scanner.nextInt();
                    stockManagement.decreaseStock(codeToDecreaseStock, quantityToDecrease);
                    System.out.println("Stock decreased successfully!");
                    break;
                case 8:
                    exit = true;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
        }

        scanner.close();
    }
}
