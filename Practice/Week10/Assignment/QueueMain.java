package Week10.Assignment;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Choose menu: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Peek first");
        System.out.println("4. Peek rear");
        System.out.println("5. Peek by NIM");
        System.out.println("6. Print all");
        System.out.println("=======================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert maximum queue: ");
        int max = sc.nextInt();
        
        Queue queue = new Queue(max);
        
        int choice;
        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sc.nextLine(); // consume newline
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Class Number: ");
                    int classNumber = sc.nextInt();
                    System.out.print("GPA: ");
                    double gpa = sc.nextDouble();
                    Student student = new Student(nim, name, classNumber, gpa);
                    queue.enqueue(student);
                    break;
                case 2:
                    Student dequeuedStudent = queue.dequeue();
                    if (dequeuedStudent != null) {
                        System.out.println("Data removed: " + dequeuedStudent.nim + " " + dequeuedStudent.name
                                           + " " + dequeuedStudent.classNumber + " " + dequeuedStudent.gpa);
                    }
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.peekRear();
                    break;
                case 5:
                    sc.nextLine(); // consume newline
                    System.out.print("Enter NIM to peek: ");
                    String peekNim = sc.nextLine();
                    queue.peekPosition(peekNim);
                    break;
                case 6:
                    queue.print();
                    break;
            }
        } while (choice >= 1 && choice <= 6);

        sc.close();
    }
}
