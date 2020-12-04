package Sorting;

public class SelectionSort extends Algorithm {
    public static void main(String args[]) {
        int[] array = {5, 2 , 2, 3 ,121, 4322 ,0, -1 , -2 , -100};
        printArray(array); 
        selectionSort(array);
        printArray(array); 
    }

    private static void selectionSort(int[] array) {
        int minIndex;
        
        for (int i=0; i < array.length - 1; i++) {
            minIndex = i;
            for (int j= i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;

                }
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;

            }
        }
    }

    

    


    /*
    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
    */
}
