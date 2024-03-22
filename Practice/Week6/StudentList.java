package Week6;

public class StudentList {
    Student list[] = new Student[5];
    int idx;

    void add(Student std) {
        if (idx<list.length) {
            list[idx] = std;
            idx++;
        } else {
            System.out.println("The student list is already full-filled");
        }
    }

    void print() {
        for (Student s: list) {
            s.print();
            System.out.println("===============================");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < list.length-1; i++) {
            for (int j = 1; j < list.length-i; j++) {
                if (list[j].gpa > list[j-1].gpa) {
                    //SWAP
                    Student tmp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = tmp;
                }
            }
        }
    }
}
