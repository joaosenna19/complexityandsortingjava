package sorting;

public class InsertionSort {
    public static <T extends Comparable<T>> void insertionSort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            T currentVal = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(currentVal) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentVal;
        }
        
    }
}
