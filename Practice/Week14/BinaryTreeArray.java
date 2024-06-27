package Week14;

public class BinaryTreeArray {
    int[] data;
    int idxLast;

    BinaryTreeArray(int size) {
        data = new int[size];
        idxLast = -1;
    }

    void add(int data) {
        if (idxLast < this.data.length - 1) {
            this.data[++idxLast] = data;
        } else {
            System.out.println("Tree is full");
        }
    }

    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart){
        if (idxStart<=idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }

    void traversePreOrder(int index) {
        if (index <= idxLast) {
            System.out.print(data[index] + " ");
            traversePreOrder(2 * index + 1);
            traversePreOrder(2 * index + 2);
        }
    }

    void traversePostOrder(int index) {
        if (index <= idxLast) {
            traversePostOrder(2 * index + 1);
            traversePostOrder(2 * index + 2);
            System.out.print(data[index] + " ");
        }
    }
}
