package Week7;

public class SortMain {
    public static void main(String[] args) {
        //Create an object
        MergeSort mergeSort = new MergeSort();
        int[] data = {10, 40, 30, 50, 70, 20, 100, 90};

        System.out.println("Sorting with merge sort");
        System.out.println("Initial Data");
        mergeSort.printArray(data);

        //Call mergeSort method to sort the array
        mergeSort.sort(data, 0, data.length - 1);
        System.out.println("Sorted Data");
        mergeSort.printArray(data);
    }
}
