
import java.util.ArrayList;

public class HeapSort<T extends Comparable<T>> {

    private ArrayList<T> list;

    // Constructor initializes the list
    public HeapSort() {
        list = new ArrayList<>();
    }

    // Method to swap two elements in the heap
    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    // Helper methods to find parent, left, and right child indices
    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    // Insert a value into the heap and maintain the heap property
    public void insert(T value) {
        list.add(value);
        heapifyUp(list.size() - 1);
    }

    // Heapify up to maintain the min-heap property
    private void heapifyUp(int index) {
        if (index == 0) {
            return;
        }
        int p = parent(index);
        if (list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            heapifyUp(p);
        }
    }

    // Remove the root element and maintain the heap property
    public T remove() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Cannot remove from an empty heap");
        }

        T root = list.get(0);
        T last = list.remove(list.size() - 1);

        if (!list.isEmpty()) {
            list.set(0, last);
            heapifyDown(0);
        }

        return root;
    }

    // Heapify down to maintain the min-heap property
    private void heapifyDown(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }

        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if (min != index) {
            swap(index, min);
            heapifyDown(min);
        }
    }

    // Heap Sort Method: Return a sorted list of elements
    public ArrayList<T> heapSort() {
        ArrayList<T> sortedList = new ArrayList<>();
        while (!list.isEmpty()) {
            sortedList.add(remove());  // Remove the root element and add it to the sorted list
        }
        return sortedList;  // Sorted in ascending order for a min-heap
    }

    // Main method to test the HeapSort functionality and heap sort
    public static void main(String[] args) {
        HeapSort<Integer> heap = new HeapSort<>();
        heap.insert(10);
        heap.insert(5);
        heap.insert(20);
        heap.insert(3);
        heap.insert(15);

        // Heap sort operation
        ArrayList<Integer> sortedList = heap.heapSort();  // Corrected method call

        // Display sorted elements
        System.out.println("Sorted elements using Heap Sort: " + sortedList);
    }
}
