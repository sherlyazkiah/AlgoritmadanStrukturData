package Week4;

public class Employee {
    String name;
    int salary1, salary2, salary3;
    int age, livingAllowance, transportAllowance;

    public Employee(String na, int ag, int sal1, int sal2, int sal3, int la, int ta) {
        name = na;
        age = ag;
        salary1 = sal1;
        salary2 = sal2;
        salary3 = sal3;
        livingAllowance = la;
        transportAllowance = ta;
    }

    public double ttlsalary() {
        return salary1+salary2+salary3;
    }

    public double totalSalary() {
        return salary1+salary2+salary3+livingAllowance+transportAllowance;
    }

    public double totalAllowance() {
        return livingAllowance+transportAllowance;
    }

    void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + ttlsalary());
        System.out.println("Living Allowance: " + livingAllowance);
        System.out.println("Transportation Allowance: " + transportAllowance);
        System.out.println("Total Salary: " + totalSalary());
        System.out.println("Total Allowance: " + totalAllowance());
    }

    void printBiggestAllowance() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Total Allowance: " + totalAllowance());
    }
}
