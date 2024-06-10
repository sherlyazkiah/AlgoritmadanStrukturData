package Week8.Assignment2;

public class ReceiptStack {
    private int size;
    private int top;
    private Receipt[] data;

    public ReceiptStack(int size) {
        this.size = size;
        data = new Receipt[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Receipt receipt) {
        if (!isFull()) {
            top++;
            data[top] = receipt;
        } else {
            System.out.println("Receipt stack is full.");
        }
    }

    public Receipt pop() {
        if (!isEmpty()) {
            Receipt poppedReceipt = data[top];
            top--;
            return poppedReceipt;
        } else {
            System.out.println("Receipt stack is empty.");
            return null;
        }
    }
}
