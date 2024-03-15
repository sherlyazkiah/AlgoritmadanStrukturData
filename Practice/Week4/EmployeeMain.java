package Week4;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] emp = new Employee[4];

        emp[0] = new Employee("Rara", 30, 1500000, 2000000, 1250000, 500000, 100000);
        emp[1] = new Employee("Leo", 40, 2500000, 1500000, 900000, 250000, 250000);
        emp[2] = new Employee("Sasha", 38, 2000000, 850000, 2000000, 300000, 150000);
        emp[3] = new Employee("Raden", 45, 3000000, 2500000, 1000000, 450000, 100000);

        for (int i = 0; i < emp.length; i++) {
            emp[i].printData();
            emp[i].totalSalary();
            System.out.println();
        }

        // Calculate total salary of patient whose age is >35
        double sum = 0;
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].age > 35) {
                sum = sum + emp[i].totalSalary();
            }
        }

        // Calculate average
        double avg = 0;
        avg = sum/3;
        System.out.println("Average of total salary = " + avg);
    
        // Find biggest allowance of 35-50 years old employee
        double maxAllow35 = 0;
        int idx35 = 0;
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].age > 35) {
                sum = sum + emp[i].totalSalary();
                if (emp[i].totalAllowance() > maxAllow35) {
                    maxAllow35 = emp[i].totalAllowance();
                    idx35 = i;
                }
            }
        }
        System.out.println();
        System.out.println("Employee of 35-50 years old who has the biggest allowance");
        emp[idx35].printBiggestAllowance();

        // Find biggest allowance of all employee
        double maxAllow = 0;
        int idx = 0;
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].totalAllowance() > maxAllow) {
                maxAllow = emp[i].totalAllowance();
                idx = i;
            }
        }

        System.out.println();
        System.out.println("Employee who has the biggest allowance");
        emp[idx].printBiggestAllowance();
    }
}
