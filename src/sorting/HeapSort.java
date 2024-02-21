package sorting;

public class HeapSort<T extends Comparable<T>> {

    private void heapify(T[] arr, int n, int i) {
        int largest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 

       
        if (left < n && arr[left].compareTo(arr[largest]) > 0)
            largest = left;

       
        if (right < n && arr[right].compareTo(arr[largest]) > 0)
            largest = right;

       
        if (largest != i) {
            swap(arr, i, largest);
            
            heapify(arr, n, largest);
        }
    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void heapSort(T[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        
        for (int i = n - 1; i >= 0; i--) {
            
            swap(arr, 0, i);

            
            heapify(arr, i, 0);
        }
    }
}
