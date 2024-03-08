package Week3;

public class Student {
    String name, nim, gender;
    double GPA;

    Student(String na, String ni, String gen, double gpa) {
        name = na;
        nim = ni;
        gender = gen;
        GPA = gpa;
    }

    void print() {
        System.out.println("Name : " + name);
        System.out.println("NIM : " + nim);
        System.out.println("Gender : " + gender);
        System.out.println("GPA score : " + GPA);
    }
}