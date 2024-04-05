package Week7;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        SearchStudent data = new SearchStudent();
        int amountStudent = 5;

        System.out.println("------------------------------------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("----------------------------");
            System.out.print("NIM\t: ");
            int nim = s.nextInt();
            System.out.print("Name\t: ");
            String name = sl.nextLine();
            System.out.print("Age\t: ");
            int age = s.nextInt();
            System.out.print("GPA\t: ");
            double gpa = s.nextDouble();

            Students std = new Students(nim, name, age, gpa);
            data.add(std);
        }

        System.out.println("------------------------------------------------");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("____________________________");
        System.out.println("____________________________");
        System.out.print("Search student by NIM: ");
        int search = s.nextInt();
        System.out.println("Using Sequential Search");
        int position = data.findSeqSearch(search);
        data.showPosition(search, position);
        data.showData(search, position);

        System.out.println("____________________________");
        System.out.println("____________________________");
        System.out.print("Search student by NIM: ");
        int search1 = s.nextInt();
        System.out.println("Using Binary Search");
        int position1 = data.findSeqSearch(search1);
        data.showPosition(search1, position1);
        data.showData(search1, position1);

        s.close();
        sl.close();
    }
}
