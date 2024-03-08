package Week3;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student std[] = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Insert student " + i);
            System.out.print("Insert name: ");
            String iname = sc.next();
            System.out.print("Insert nim: ");
            String inim = sc.next();
            System.out.print("Insert gender: ");
            String igender = sc.next();
            System.out.print("Insert GPA: ");
            double igpa = sc.nextDouble();
            std[i] = new Student(iname, inim, igender, igpa); 
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Student " + i);
            std[i].print();
            System.out.println();
        }

        double sum = 0;
        for (int i = 0; i < std.length; i++) {
            sum = sum + std[i].GPA;
        }

        double avg = sum/std.length;
        System.out.println("Average GPA : " + avg);
        System.out.println();
        
        double maxGPA = std[0].GPA;
        int idx = 0;
        for (int i = 0; i < std.length; i++) {
            if (std[i].GPA > maxGPA) {
                maxGPA = std[i].GPA;
                idx = i;
            }
        }
        System.out.println("Student that has biggest GPA");
        std[idx].print();

        sc.close();

    }
}
