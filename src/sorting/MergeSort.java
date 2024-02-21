package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> {
	@SuppressWarnings("unchecked")
	private T[] merge(T[] arr1, T[] arr2) {
		// needed as assignment states we must initialize the objects and put them into an Array (not ArrayList)
		int totalLength = arr1.length + arr2.length;
		
		T[] sortedArray = (T[]) Array.newInstance(arr1.getClass().getComponentType(), totalLength);
		int i = 0;
		int j = 0;
		int k = 0;
		
		 while (i < arr1.length && j < arr2.length) {
	            if (arr1[i].compareTo(arr2[j]) > 0) {
	                sortedArray[k] = arr2[j];
	                j++;
	            } else {
	                sortedArray[k] = arr1[i];
	                i++;
	            }
	            k++;
	        }
	  
	        while (i < arr1.length) {
	            sortedArray[k] = arr1[i];
	            i++;
	            k++;
	        }

	        while (j < arr2.length) {
	            sortedArray[k] = arr2[j];
	            j++;
	            k++;
	        }
		
		
		return sortedArray;
	}
	
	public T[] mergeSort(T[] arr) {
		if(arr.length == 1) return arr;
		int middle = arr.length / 2;
		T[] left = mergeSort(Arrays.copyOfRange(arr, 0, middle));
		T[] right = mergeSort(Arrays.copyOfRange(arr, middle, arr.length));
		
		return merge(left,right);
	
	}

	
}
