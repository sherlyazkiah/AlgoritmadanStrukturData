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

        sc.close();
        
    }
}
