package Week8;

public class BookStack {
    int size, top;
    Book data[];

    public BookStack(int size) {
        this.size = size;
        data = new Book[size];
        top = -1;
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Book dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            Book x = data[top];
            top--;
            System.out.println("Remove data : " + x.title + " " +
                    x.authorName + " " + x.publishedYear + " " +
                    x.pagesAmount + " " + x.price);
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void peek() {
        System.out.println("Top element : " + data[top]);
    }

    public void print() {
        System.out.println("Stack content: ");
        for (int i = top; i >- 0; i--) {
            System.out.println(data[i].title + " " +
            data[i].authorName + " " + data[i].publishedYear + " " +
            data[i].pagesAmount + " " + data[i].price);
        }
        System.out.println("");
    }

    public void clear() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack is now empty");
        } else {
            System.out.println("Failed! Stack is still empty");
        }
    }
}
