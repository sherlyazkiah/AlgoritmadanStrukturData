package Week3;

import java.util.Scanner;

public class ArrayOfObject22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of triangle: ");
        int n = sc.nextInt();
        Rectangle22[] rectangleArray = new Rectangle22[n];

        // Assign the values for each attribute in objects
        for (int i = 0; i < rectangleArray.length; i++) {
            rectangleArray[i] = new Rectangle22();
            System.out.println("Rectangle " + i);

            System.out.print("Input length : ");
            rectangleArray[i].length = sc.nextInt();

            System.out.print("Input width : ");
            rectangleArray[i].width = sc.nextInt();
        }

        System.out.println();
        
        // Display the result in console
        for (int i = 0; i < rectangleArray.length; i++) {
            System.out.println("Rectangle " + i);
            System.out.println("width: " + rectangleArray[i].width + ", length: " + rectangleArray[i].length);
        }

        sc.close();

    }
}