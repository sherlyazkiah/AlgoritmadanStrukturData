package Week10.Assignment;

public class Queue {
    int max, front, rear, size;
    Student[] stdQueue;

    public Queue(int max) {
        this.max = max;
        create();
    }

    public void create() {
        stdQueue = new Student[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Student stdQueue) {
        if (isFull()) {
            System.out.println("Queue is already full");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            this.stdQueue[rear] = stdQueue;
            size++;
        }
    }

    public Student dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is still empty");
            return null;
        } else {
            Student data = stdQueue[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
            return data;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is still empty");
        } else {
            int i = front;
            while (i != rear) {
                printStudents(i);
                i = (i + 1) % max;
            }
            printStudents(i);
            System.out.println("Element amount : " + size);
        }
    }

    public void peek() {
        if (!isEmpty()) {
            printStudents(front);
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            printStudents(rear);
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void peekPosition(String nim) {
        if (!isEmpty()) {
            int i = front;
            boolean found = false;
            while (i != rear) {
                if (stdQueue[i].nim.equals(nim)) {
                    printStudents(i);
                    found = true;
                    break;
                }
                i = (i + 1) % max;
            }
            if (stdQueue[i].nim.equals(nim)) {
                printStudents(i);
                found = true;
            }
            if (!found) {
                System.out.println("Student with NIM " + nim + " not found in the queue.");
            }
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void printStudents(int position) {
        Student student = stdQueue[position];
        System.out.println("Student NIM: " + student.nim + ", Name: " + student.name + 
                           ", Class Number: " + student.classNumber + ", GPA: " + student.gpa);
    }
}
