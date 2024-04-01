package Week6;

public class HighAchieverStudent {
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

    void selectionSort() {
        for (int i = 0; i < list.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < list.length; j++) {
                if (list[j].gpa < list[idxMin].gpa) {
                    idxMin = j;
                }
            }
            //SWAP
            Student tmp = list[idxMin];
            list[idxMin] = list[i];
            list[i] = tmp;
        }
    }
    
    void insertionSort() {
        for (int i = 0; i < list.length; i++) {
            Student tmp = list[i];
            int j = i;
            while (j > 0 && list[j-i].gpa > tmp.gpa) {
                list[j] = list[j-1];
                j--;
            }
            list[j] = tmp;
        }
    }

    void insertionSort(boolean asc) {
        for (int i = 1; i < list.length; i++) {
            Student temp = list[i];
            int j = i - 1;
            if (asc) {
                // Ascending order sorting algorithm
                while (j >= 0 && list[j].gpa > temp.gpa) {
                    list[j + 1] = list[j];
                    j--;
                }
            } else {
                // Descending order sorting algorithm
                while (j >= 0 && list[j].gpa < temp.gpa) {
                    list[j + 1] = list[j];
                    j--;
                }
            }
            list[j + 1] = temp;
        }
    }   
}