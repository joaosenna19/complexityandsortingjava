## HeapSort Algorithm

# Description
A heap is basically a ordered binary tree by using the max-heap property.
It means that the largest element of a collection is always at the root and each child is smaller than its parent.

Example:
        15
       /  \
    10      8
   / \     / \
  3   6   2   7

The HeapSort algortithm works by getting an input array and transforming it into a max-heap.
First, a binary tree is created and, by calling the heapify method, it interates through the array, ensuring the max-heap property is implement for each subtree. 
The sorting is made by swapping the largest element (at the root of the heap) with the last element in the array. 
It guarantees that largest element is always in the correct sorted position.
As the largest element is placed and sorted, it is removed and we need to 'heapify' again the tree. Recursion is used in order to obtain this result until all elements are swapped.

# Complexity Analysis
-- Time Complexity
- O(n log n) for average cases.

-- Space Complexity
- O(1) (it's in place sorting, as it modifies the original array).

# Pseudocode
We implement it with the heapify()  helper method.
- heapify(T[] arr, int n, int i):
    Attributes:
    - arr: the arr representing the heap;
    - n: number of the elements;
    - i: starting index of the node to start the heapify.
    Variables: 
    - largest = largest element index as root;
    - left = left child index (obtained by the formula 2 * i + 1);
    - right = right child index (obtained by the formula 2 * i + 2).

    Steps:
        1. Check if left child exists and is greater than root. If so, largest = left;
        2. Check if right child exists and is greater than root. If so, largest = right;
        3. If the largest element is not root, we swap it with the root and heapify it again (recursion);
    
    Counting:
    heapify is n log n comparisons as each element might be compared with its children. Same for each time we need to rebuild the heap.


- heapSort(T[] arr):
That's the main code of the algorithm.
    Atributes:
    - arr: the input array.

    Steps:
    1. Build a max-heap by using a for loop;
    2. With another for loop, extract each elements by swapping and heapifying after each iteration.

     Counting:
     Extracting elements is n comparisons as we compare the root with remaining elements.





