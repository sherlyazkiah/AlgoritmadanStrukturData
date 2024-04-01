package Week6;

public class TicketService {

    Ticket[] tickets;
    int size;
    
    public TicketService(int capacity) {
        tickets = new Ticket[capacity];
        size = 0;
    }

    public void add(Ticket t) {
        if (size < tickets.length) {
            tickets[size++] = t;
        } else {
            System.out.println("Ticket service is full.");
        }
    }

    public void displayAll() {
        for (Ticket t : tickets) {
            System.out.println("Airlines: " + t.airlines + ", Destination: " + t.destination +
                    ", Origin: " + t.origin + ", Price: " + t.price);
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (tickets[j].price > tickets[j + 1].price) {
                    Ticket temp = tickets[j];
                    tickets[j] = tickets[j + 1];
                    tickets[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (tickets[j].price < tickets[minIndex].price) {
                    minIndex = j;
                }
            }
            Ticket temp = tickets[minIndex];
            tickets[minIndex] = tickets[i];
            tickets[i] = temp;
        }
    }
}