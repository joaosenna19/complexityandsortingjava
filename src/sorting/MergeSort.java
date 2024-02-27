package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class MergeSort {
	
	private static <T extends Comparable<T>> T[] merge(T[] arr1, T[] arr2) {
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

    private static <T> T[] merge(T[] arr1, T[] arr2, Comparator<T> comparator) {
        int totalLength = arr1.length + arr2.length;

        T[] sortedArray = (T[]) Array.newInstance(arr1.getClass().getComponentType(), totalLength);
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (comparator.compare(arr1[i], arr2[j]) > 0) {
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

    public static <T extends Comparable<T>> T[] mergeSort(T[] arr) {
        if (arr.length == 1) return arr;
        int middle = arr.length / 2;
        T[] left = mergeSort(Arrays.copyOfRange(arr, 0, middle));
        T[] right = mergeSort(Arrays.copyOfRange(arr, middle, arr.length));

        return merge(left, right);
    }

    public static <T> T[] mergeSort(T[] arr, Comparator<T> comparator) {
        if (arr.length == 1) return arr;
        int middle = arr.length / 2;
        T[] left = mergeSort(Arrays.copyOfRange(arr, 0, middle), comparator);
        T[] right = mergeSort(Arrays.copyOfRange(arr, middle, arr.length), comparator);

        return merge(left, right, comparator);
    }
}

