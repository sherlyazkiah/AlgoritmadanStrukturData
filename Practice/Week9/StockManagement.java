package Week9;
    
public class StockManagement {
    Item[] listItem;
    int idx;

    public StockManagement() {
        listItem = new Item[100];
        idx = 0;
    }

    // Method to add an item
    public void addItem(Item item) {
        listItem[idx++] = item;
    }

    // Method to display all items
    public void displayAllItems() {
        for (int i = 0; i < idx; i++) {
            System.out.println(listItem[i]);
        }
    }

    // Method to sort items by stock
    public void sortItemsByStock() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listItem[j].stock > listItem[j + 1].stock) {
                    Item temp = listItem[j];
                    listItem[j] = listItem[j + 1];
                    listItem[j + 1] = temp;
                }
            }
        }
    }

    // Method to display food items with no stock
    public void displayFoodItemsWithNoStock() {
        for (int i = 0; i < idx; i++) {
            if (listItem[i].category.equalsIgnoreCase("food") && listItem[i].stock == 0) {
                System.out.println(listItem[i]);
            }
        }
    }

    // Method to search for an item by name
    public void searchItemByName(String keyword) {
        for (int i = 0; i < idx; i++) {
            if (listItem[i].name.equalsIgnoreCase(keyword)) {
                System.out.println(listItem[i]);
            }
        }
    }

    // Method to add stock for a certain item
    public void addStock(int itemCode, int quantity) {
        for (int i = 0; i < idx; i++) {
            if (listItem[i].itemCode == itemCode) {
                listItem[i].stock += quantity;
                break;
            }
        }
    }

    // Method to decrease stock for a certain item
    public void decreaseStock(int itemCode, int quantity) {
        for (int i = 0; i < idx; i++) {
            if (listItem[i].itemCode == itemCode) {
                listItem[i].stock = Math.max(0, listItem[i].stock - quantity);
                break;
            }
        }
    }
}
