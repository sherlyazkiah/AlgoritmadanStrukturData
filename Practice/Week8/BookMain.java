package Week8;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        BookStack st = new BookStack(8);
        Scanner sc = new Scanner(System.in);

        char choose;
        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Title : ");
                    String title = sc.nextLine();

                    System.out.print("Author Name : ");
                    String name = sc.nextLine();

                    System.out.print("Published Year : ");
                    int year = sc.nextInt();

                    System.out.print("Pages Amount : ");
                    int pages = sc.nextInt();

                    System.out.print("Price : ");
                    int price = sc.nextInt();

                    Book bk = new Book(title, name, year, pages, price);
                    st.push(bk);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    st.print();
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
            
            System.out.print("Back to menu (y/n)? ");
            choose = sc.next().charAt(0);
            System.out.println();
            sc.nextLine();

        } while (choose == 'y');

        sc.close();
    }
}
