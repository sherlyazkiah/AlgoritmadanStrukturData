package Week8;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        BookStack st = new BookStack(8);
        Scanner sc = new Scanner(System.in);

        char choose;
        do {
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
            System.out.print("Do you want to add new data to stack (y/n)? ");
            choose = sc.next().charAt(0);
            System.out.println();
            sc.nextLine();
            st.push(bk);

        } while (choose == 'y');

        st.print();
        st.pop();
        st.peek();
        st.print();

        sc.close();
    }
}
