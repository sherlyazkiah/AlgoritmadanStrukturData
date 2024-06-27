package FinalExam;

import java.util.Scanner;

// Vehicle class represents a vehicle with registration number, owner name, type, cc, year, and month to pay.
class Vehicle {
    private String regNumber;
    private String name;
    private String type;
    private int cc;
    private int year;
    private int monthToPay;
    Vehicle next;
    Vehicle prev;

    public Vehicle(String regNumber, String name, String type, int cc, int year, int monthToPay) {
        this.regNumber = regNumber;
        this.name = name;
        this.type = type;
        this.cc = cc;
        this.year = year;
        this.monthToPay = monthToPay;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCc() {
        return cc;
    }

    public int getYear() {
        return year;
    }

    public int getMonthToPay() {
        return monthToPay;
    }
}

// TaxTransaction class represents a tax payment transaction for a vehicle.
class TaxTransaction {
    private static int codeCounter = 1;
    private int code;
    private long nominal;
    private long penalty;
    private int monthToPay;
    private Vehicle vehicle;
    TaxTransaction next;
    TaxTransaction prev;

    public TaxTransaction(long nominal, long penalty, int monthToPay, Vehicle vehicle) {
        this.code = codeCounter++;
        this.nominal = nominal;
        this.penalty = penalty;
        this.monthToPay = monthToPay;
        this.vehicle = vehicle;
    }

    public int getCode() {
        return code;
    }

    public long getNominal() {
        return nominal;
    }

    public long getPenalty() {
        return penalty;
    }

    public int getMonthToPay() {
        return monthToPay;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}


// DoubleLinkedList class represents a doubly linked list to store vehicles or transactions.
class DoubleLinkedList {
    Node head;
    Node tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Add a vehicle to the linked list
    public void add(Vehicle vehicle) {
        Node newNode = new Node(vehicle);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Find a vehicle in the linked list by registration number
    public Vehicle find(String regNumber) {
        Node current = head;
        while (current != null) {
            if (current.vehicle.getRegNumber().equals(regNumber)) {
                return current.vehicle;
            }
            current = current.next;
        }
        return null;
    }

    // Print the list of vehicles
    public void printList() {
        Node current = head;
        System.out.println("Vehicle List");
        System.out.println("-------------------------------------------------");
        System.out.println("Reg Number | Owner Name | Type | CC | Year | Month to Pay");
        while (current != null) {
            Vehicle vehicle = current.vehicle;
            System.out.printf("%s | %s | %s | %d | %d | %d%n",
                vehicle.getRegNumber(),
                vehicle.getName(),
                vehicle.getType(),
                vehicle.getCc(),
                vehicle.getYear(),
                vehicle.getMonthToPay());
            current = current.next;
        }
        System.out.println("-------------------------------------------------");
    }
}

public class FinalExam {
    private static DoubleLinkedList vehicles = new DoubleLinkedList(); // Linked list for vehicles
    private static DoubleLinkedList transactions = new DoubleLinkedList(); // Linked list for transactions

    public static void main(String[] args) {
        initializeVehicles(); // Initialize the vehicle list
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        System.out.println("=========== FINAL EXAM (LABS) TI - 1I ===========");
        System.out.println("Developed By : Shelrly Lutfi Azkiah Sulistyawati");
        System.out.println("NIM : 2341720241");
        System.out.println("Attendance No : 22");
        System.out.println("=================================================");
        System.out.println("Tax Payment System");

        // Main menu loop
        while (option != 5) {
            System.out.println("\nMenu");
            System.out.println("1. Vehicle List");
            System.out.println("2. Tax Payment");
            System.out.println("3. Print All Transactions");
            System.out.println("4. Sort Transactions by Owner Name");
            System.out.println("5. Exit");
            System.out.print("Your Option (1-5): ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            // Handle menu options
            switch (option) {
                case 1:
                    vehicles.printList(); // Print the vehicle list
                    break;
                case 2:
                    taxPayment(scanner); // Process tax payment
                    break;
                case 3:
                    printAllTransactions(); // Print all transactions
                    break;
                case 4:
                    sortTransactionsByOwnerName(); // Sort transactions by owner name
                    break;
                case 5:
                    System.out.println("Exiting the Program!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }

    // Initialize vehicles
    private static void initializeVehicles() {
        vehicles.add(new Vehicle("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4));
        vehicles.add(new Vehicle("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3));
        vehicles.add(new Vehicle("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2));
        vehicles.add(new Vehicle("B 1234 AG", "Sisa", "Motor", 150, 2020, 1));
    }

    // Process tax payment
    private static void taxPayment(Scanner scanner) {
        System.out.print("Input your vehicle reg number: ");
        String regNumber = scanner.nextLine();
        System.out.print("Month to pay: ");
        int monthToPay = scanner.nextInt();

        Vehicle vehicle = vehicles.find(regNumber);
        if (vehicle == null) {
            System.out.println("Vehicle not found!");
            return;
        }

        long nominal = calculateNominal(vehicle);
        long penalty = calculatePenalty(vehicle.getMonthToPay(), monthToPay);
        TaxTransaction transaction = new TaxTransaction(nominal, penalty, monthToPay, vehicle);
        transactions.add(transaction.getVehicle());

        System.out.println("Transaction Successful!");
        System.out.printf("Code: %d | Vehicle Reg Number: %s | Name: %s | Nominal: %d | Penalty: %d%n",
            transaction.getCode(), vehicle.getRegNumber(), vehicle.getName(), nominal, penalty);
    }

    // Calculate the tax nominal amount based on vehicle type and cc
    private static long calculateNominal(Vehicle vehicle) {
        if (vehicle.getType().equalsIgnoreCase("Motor")) {
            if (vehicle.getCc() < 100) {
                return 100000;
            } else if (vehicle.getCc() <= 250) {
                return 250000;
            } else {
                return 500000;
            }
        } else if (vehicle.getType().equalsIgnoreCase("Mobil")) {
            if (vehicle.getCc() < 1000) {
                return 750000;
            } else if (vehicle.getCc() <= 2500) {
                return 1000000;
            } else {
                return 1500000;
            }
        }
        return 0;
    }

    // Calculate the penalty amount based on month to pay and current month
    private static long calculatePenalty(int monthToPay, int currentMonth) {
        int monthsLate = currentMonth - monthToPay;
        if (monthsLate > 0 && monthsLate <= 3) {
            return 50000;
        } else if (monthsLate > 3) {
            return 50000 * (monthsLate - 2);
        }
        return 0;
    }

    // Print all transaction
    private static void printAllTransactions() {
        Node current = transactions.head;
        System.out.println("Tax Payment Transaction List");
        System.out.println("-------------------------------------------------");
        System.out.println("Code | Vehicle Reg Number | Name | Nominal | Penalty");
        long totalIncome = 0;
        while (current != null) {
            Vehicle vehicle = current.vehicle;
            System.out.printf("%d | %s | %s | %d | %d%n",
                vehicle.getRegNumber(),
                vehicle.getName(),
                calculateNominal(vehicle),
                calculatePenalty(vehicle.getMonthToPay(), vehicle.getMonthToPay()));  // Example calculation
            totalIncome += calculateNominal(vehicle) + calculatePenalty(vehicle.getMonthToPay(), vehicle.getMonthToPay());
            current = current.next;
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Total Income: " + totalIncome);
    }

    // Sort Transaction by Owner Name
    private static void sortTransactionsByOwnerName() {
        if (transactions.head == null) return;
        boolean swapped;
        do {
            swapped = false;
            Node current = transactions.head;
            while (current.next != null) {
                if (current.vehicle.getName().compareTo(current.next.vehicle.getName()) > 0) {
                    Vehicle temp = current.vehicle;
                    current.vehicle = current.next.vehicle;
                    current.next.vehicle = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
        printAllTransactions();
    }
}
