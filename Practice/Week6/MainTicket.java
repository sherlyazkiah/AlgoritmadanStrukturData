package Week6;

public class MainTicket {
    public static void main(String[] args) {
        TicketService ticketService = new TicketService(5);
        ticketService.add(new Ticket("Airline1", "Destination1", "Origin1", 300));
        ticketService.add(new Ticket("Airline2", "Destination2", "Origin2", 200));
        ticketService.add(new Ticket("Airline3", "Destination3", "Origin3", 400));
        ticketService.add(new Ticket("Airline4", "Destination4", "Origin4", 100));
        ticketService.add(new Ticket("Airline5", "Destination5", "Origin5", 500));

        System.out.println("Unsorted Tickets:");
        ticketService.displayAll();

        // Sorting by bubble sort
        ticketService.bubbleSort();
        System.out.println("\nTickets sorted by price in ascending order (Bubble Sort):");
        ticketService.displayAll();

        // Sorting by selection sort
        ticketService.selectionSort();
        System.out.println("\nTickets sorted by price in ascending order (Selection Sort):");
        ticketService.displayAll();
    }
}