package Week5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("Program for Calculating Total Profits");
        System.out.print("Input the Number of Companies: ");
        int numCompanies = sc.nextInt();
       
        Sum[] companies = new Sum[numCompanies];

        System.out.println("=======================================================");
        for (int i = 0; i < numCompanies; i++) {
            System.out.print("Input the number of months for company " + (i+1) + ": ");
            int months = sc.nextInt();
            companies[i] = new Sum(months);

            System.out.println("Input profits for company " + (i+1) + " : ");
            for (int j = 0; j < months; j++) {
                System.out.print("Profit for month " + (j+1) + " = ");
                companies[i].profit[j] = sc.nextDouble();
            }
        }

        System.out.println("=======================================================");
        for (int i = 0; i < companies.length; i++) {
            System.out.println("Company " + (i+1) + " - Total profits:");
            System.out.println("Algoritma Brute Force = " + companies[i].totalBF(companies[i].profit));
            System.out.println("Algoritma Divide Conquer = " + companies[i].totalDC(companies[i].profit, 0, companies[i].elemen-1));
        }
        System.out.println("=======================================================");

        sc.close();
    }
}
