package Week3;

import java.util.Scanner;

public class ArrayOfObject22 {
    public static void main(String[] args) {
        Rectangle22[] rectangleArray = new Rectangle22[3];
        Scanner sc = new Scanner(System.in);

        // Assign the values for each attribute in objects
        for (int i = 0; i < 3; i++) {
            rectangleArray[i] = new Rectangle22();
            System.out.println("Rectangle " + i);

            System.out.print("Input length : ");
            rectangleArray[i].length = sc.nextInt();

            System.out.print("Input width : ");
            rectangleArray[i].width = sc.nextInt();
        }

        // Display the result in console
        for (int i = 0; i < 10; i++) {
            System.out.println("Rectangle " + i);
            System.out.println("width: " + rectangleArray[0].width + ", length: " + rectangleArray[0].length);
        }

        sc.close();

    }
}