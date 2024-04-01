package Week5;

public class MainScoreAlgSdt {
    public static void main(String[] args) {

        ScoreAlgSdt[] students = new ScoreAlgSdt[3]; 
        students[0] = new ScoreAlgSdt("Rani", 90, 80, 85, 95);
        students[1] = new ScoreAlgSdt("Dani", 70, 75, 80, 85);
        students[2] = new ScoreAlgSdt("Saraswati", 85, 90, 95, 85);

        double total = 0;
        System.out.println("Name\t\tTotal Value of Algorithm Courses");
        System.out.println("================================================");
        for (ScoreAlgSdt student : students) {
            double totalScore = student.calculateTotalScore();
            System.out.println(student.getNameSdt() + "\t\t" + totalScore);
            total += totalScore;
        }
        double average = total / students.length;
        System.out.println("Average\t\t" + average);
    }
}