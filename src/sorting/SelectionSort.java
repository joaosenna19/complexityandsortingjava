package sorting;

public class SelectionSort<T extends Comparable<T>> {
	public T[] selectionSort(T[] arr){
		
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
		
		return arr;
	}

}
