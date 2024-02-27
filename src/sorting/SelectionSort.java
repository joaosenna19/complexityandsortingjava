package sorting;

import java.util.Comparator;

public class SelectionSort {
    
    public static <T extends Comparable<T>> void selectionSort(T[] arr){
        for(int i = 0; i < arr.length; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[min].compareTo(arr[j]) > 0){
                    min = j;
                }
            }
            if(i != min) {
                T temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
    
    public static <T> void selectionSort(T[] arr, Comparator<T> c){
        for(int i = 0; i < arr.length; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(c.compare(arr[min], arr[j]) > 0){
                    min = j;
                }
            }
            if(i != min) {
                T temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
