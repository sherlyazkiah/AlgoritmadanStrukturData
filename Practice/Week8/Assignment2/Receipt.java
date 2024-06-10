package Week8.Assignment2;

public class Receipt {
    private String transactionId;
    private String date;
    private int quantityOfItems;
    private double totalPrice;

    public Receipt(String transactionId, String date, int quantityOfItems, double totalPrice) {
        this.transactionId = transactionId;
        this.date = date;
        this.quantityOfItems = quantityOfItems;
        this.totalPrice = totalPrice;
    }

    public String toString() {
        return "Transaction ID: " + transactionId + "\n" +
               "Date: " + date + "\n" +
               "Quantity of Items: " + quantityOfItems + "\n" +
               "Total Price: $" + totalPrice;
    }
}
