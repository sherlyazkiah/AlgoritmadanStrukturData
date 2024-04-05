package Week7;

public class SearchStudent {
    Students[] listStd = new Students[5];
    int idx;

    public void add(Students std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already full");
        }
    }

    public void display() {
        for (Students students : listStd) {
            students.display();
            System.out.println("----------------------------");
        }
    }

    public int findSeqSearch(int search) {
        int position = -1;
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i].nim == search) {
                position = i;
                break;
            }
        }
        return position;
    }

    public void showPosition(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " is found in index-" + pos);
        } else {
            System.out.println("Data : " + x + " is not found");
        }
    }

    public void showData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM \t : " + x);
            System.out.println("Name \t : " + listStd[pos].name);
            System.out.println("Age \t : " + listStd[pos].age);
            System.out.println("GPA \t : " + listStd[pos].gpa);
        } else {
            System.out.println("Data " + x + " is not found");
        }
    }

    public int FindBinarySearch(int search, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (search == listStd[mid].nim) {
                return (mid);
            }
        }
        return -1;
    }

    public void bubbleSort() {
        int n = listStd.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (listStd[j].nim > listStd[j+1].nim) {
                    // Swap listStd[j] and listStd[j+1]
                    Students temp = listStd[j];
                    listStd[j] = listStd[j+1];
                    listStd[j+1] = temp;
                }
            }
        }
    }

    public int findByNameSeqSearch(String name) {
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i].name.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    // In SearchStudent class
    public void showPositionByName(String name, int pos) {
        if (pos != -1) {
            System.out.println("Data " + name + " is found in index-" + pos);
        } else {
            System.out.println("Data " + name + " is not found");
        }
    }

    public void showData(String name, int pos) {
        if (pos != -1) {
            System.out.println("Name \t : " + name);
            System.out.println("NIM \t : " + listStd[pos].nim);
            System.out.println("Age \t : " + listStd[pos].age);
            System.out.println("GPA \t : " + listStd[pos].gpa);
        } else {
            System.out.println("Data " + name + " is not found");
        }
    }
}
