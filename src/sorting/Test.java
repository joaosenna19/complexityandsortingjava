package sorting;

public class Test {

	public static void main(String[] args) {
		BubbleSort<Integer> b = new BubbleSort<Integer>();
		Integer[] arr = {2, 5, 1, 9, 4, 3};
		b.bubbleSort(arr);
		for(Integer n : arr) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		System.out.println("******************Selection");
		
		SelectionSort<Integer> s = new SelectionSort<Integer>();
		Integer[] arr2 = {2, 5, 1, 9, 4, 3};
		s.selectionSort(arr2);
		for(Integer n : arr2) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("******************Insertion");
		
		InsertionSort<Integer> i = new InsertionSort<Integer>();
		Integer[] arr3 = {2, 5, 1, 9, 4, 3, 0};
		i.insertionSort(arr3);
		for(Integer n : arr3) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("******************Merge");
		
		MergeSort<Integer> m = new MergeSort<Integer>();
		Integer[] arr4 = {2, 5, 1, 9, 4, 3, 0, 10, 25, 44};
		arr4 = m.mergeSort(arr4);
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
		System.out.println("******************");
		
		Integer[] arr6 = {12, 11, 13, 5, 6, 7};
        HeapSort<Integer> h = new HeapSort<>();
        h.heapSort(arr6);

        for (Integer n : arr6) {
            System.out.print(n + " ");
        }
	}

}
