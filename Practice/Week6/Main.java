package Week6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        StudentList data = new StudentList();
        int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.print("Name = ");
            String name = s2.nextLine();
            System.out.print("Entrance year = ");
            int year = s1.nextInt();
            System.out.print("Age = ");
            int age = s1.nextInt();
            System.out.print("GPA = ");
            double gpa = s1.nextDouble();

            Student s = new Student(name, year, age, gpa);
            data.add(s);
        }

        System.out.println("Unsorted student list:");
        data.print();
        System.out.println("Student data after sorting depends on the GPA = ");
        data.bubbleSort();
        data.print();

        System.out.println("Ascending Sorted student list:");
        data.selectionSort();
        data.print();

        s1.close();
        s2.close();
    }
}
