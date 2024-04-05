package Week7;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int[][] data = {
            {45, 78, 7, 200, 80},
            {90, 1, 17, 100, 50},
            {21, 2, 40, 18, 65}
        };

        Scanner scanner = new Scanner(System.in);

        displayData(data);

        System.out.print("Enter the value to search: ");
        int searchValue = scanner.nextInt();

        int[] result = sequentialSearch2DArray(data, searchValue);

        if (result != null) {
            System.out.println("Value " + searchValue + " found at index (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Value " + searchValue + " not found in the 2D array.");
        }

        scanner.close();
    }

    public static void displayData(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] sequentialSearch2DArray(int[][] data, int target) {
        int[] result = new int[2];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == target) {
                    result[0] = i; // Row index
                    result[1] = j; // Column index
                    return result;
                }
            }
        }

        return null; // If target not found
    }
}
