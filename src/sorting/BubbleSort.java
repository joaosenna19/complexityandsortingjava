package sorting;

import java.util.Comparator;

public class BubbleSort {
    
    public static <T extends Comparable <T>> void bubbleSort(T[] arr) {
        boolean noSwap = true;
    	for(int i = arr.length - 1; i > 0; i--) {
    		for(int j = 0; j < i; j++) {
    			if(arr[j].compareTo(arr[j + 1]) > 0) {
    				T temp =  arr[j];
    				arr[j] = arr[j + 1];
    				arr[j + 1] = temp;
    				noSwap = false;
    			}

    		}
    		if (noSwap) break;
    	}
    }
    
    public static <T> void bubbleSort(T[] arr, Comparator<T> c) {
        boolean noSwap = true;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    noSwap = false;
                }
            }
            if (noSwap) break;
        }
    }
}
