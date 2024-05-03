package Week9;

public class Item {
    int itemCode;
    String name;
    String category;
    int stock;

    // Constructor
    public Item(int itemCode, String name, String category, int stock) {
        this.itemCode = itemCode;
        this.name = name;
        this.category = category;
        this.stock = stock;
    }

    public String toString() {
        return "Item Code: " + itemCode + ", Name: " + name + ", Category: " + category + ", Stock: " + stock;
    }
}
