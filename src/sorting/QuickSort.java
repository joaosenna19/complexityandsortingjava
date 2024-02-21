package sorting;

public class QuickSort<T extends Comparable<T>> {

    public void quickSort(T[] arr, int startIdx, int endIdx) {
        if (startIdx < endIdx) {
            int pivotIndex = partition(arr, startIdx, endIdx);
            quickSort(arr, startIdx, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, endIdx);
        }
    }

    private int partition(T[] arr, int startIdx, int endIdx) {
        T pivot = arr[startIdx];
        int swapIdx = startIdx;
        for (int i = startIdx + 1; i <= endIdx; i++) {
            if (arr[i].compareTo(pivot) < 0) { // Ensure objects implement Comparable
                swapIdx++;
                swap(arr, i, swapIdx);
            }
        }
        swap(arr, startIdx, swapIdx);
        return swapIdx;
	    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
	    }

}
