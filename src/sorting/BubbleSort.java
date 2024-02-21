package sorting;

public class BubbleSort<T extends Comparable<T>> {
    
    public T[] bubbleSort(T[] arr) {
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
        return arr;
    }
}
