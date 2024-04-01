package Week6;

public class Ticket {

    String airlines;
    int price;
    String destination;
    String origin;
    
    Ticket(String a, String dest, String ori, int pri) {
        airlines = a;
        destination = dest;
        origin = ori;
        price = pri;
    }
}