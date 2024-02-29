package sorting;

public class Test {

	public static void main(String[] args) {
		System.out.println("******************BubbleSort");
		Integer[] arr = {2, 5, 1, 9, 4, 3};
		BubbleSort.bubbleSort(arr);
		for(Integer n : arr) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		System.out.println("******************Selection");
		
		Integer[] arr2 = {2, 5, 1, 9, 4, 3};
		SelectionSort.selectionSort(arr2);
		for(Integer n : arr2) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("******************Insertion");
		
		Integer[] arr3 = {2, 5, 1, 9, 4, 3, 0};
		InsertionSort.insertionSort(arr3);
		for(Integer n : arr3) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("******************Merge");
		
		Integer[] arr4 = {2, 5, 1, 9, 4, 3, 0, 10, 25, 44, 5, 55555555};
		arr4 = MergeSort.mergeSort(arr4);
		for(Integer n : arr4) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("******************Quick");
		
		QuickSort<Integer> q = new QuickSort<Integer>();
		Integer[] arr5 = {2, 5, 1, 9, 4, 3, 10, 25, 44, 1};
		q.quickSort(arr5, 0, arr5.length - 1);
		for(Integer n : arr5) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("******************HeapSort");
		
		Integer[] arr6 = {12, 11, 13, 5, 6, 7, 1};
        HeapSort.heapSort(arr6);

        for (Integer n : arr6) {
            System.out.print(n + " ");
        }
	}

}
