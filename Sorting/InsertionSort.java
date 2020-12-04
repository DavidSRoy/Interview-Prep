package Sorting;

public class InsertionSort extends Algorithm {
    public static void main(String args[]) {
        int[] array = {5, 4, 3, 2, 1};
        System.out.println("Insertion Sort");
        printArray(array); 
        insertionSort(array);
        printArray(array); 
    }   
    
    private static void insertionSort(int[] array) {
        int key, value;
        for (int i = 1; i < array.length; i++) {
            key = i;
            value = array[i];

            while (key > 0 && value < array[key - 1]) {
                array[key] = array[key - 1];
                key--;
            }

            array[key] = value;
        }
    }
}
