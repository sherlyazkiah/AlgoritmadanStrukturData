package Week10;

import java.util.Scanner;

public class PassengersMain {
    public static void menu(){
        System.out.println("Choose menu: ");
        System.out.println("1. Queue");
        System.out.println("2. Dequeue");
        System.out.println("3. Check first queue");
        System.out.println("4. Check all queue");
        System.out.println("=======================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert maximum queue : ");
        int max = sc.nextInt();

        Queue Q = new Queue(max);

        int choose;
        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Name: ");
                    int newData = sc.nextInt();
                    Q.Enqueue(newData);
                    break;
                case 2:
                    int removeData = Q.Dequeue();
                    if (removeData != 0) {
                        System.out.println("Data removed : " + removeData);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
            }
        } while (choose <= 5 && choose >=1);

        sc.close();
    }
}
