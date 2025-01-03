
import java.util.ArrayList;

public class PriorityQueue<T extends Comparable<T>> {

    private ArrayList<T> list;

    // Constructor initializes the list
    public PriorityQueue() {
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

    // Insert a value into the priority queue and maintain the heap property
    public void insert(T value) {
        list.add(value);
        heapifyUp(list.size() - 1);
    }

    // Heapify up to maintain the min-heap property (for priority queue)
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

    // Remove and return the highest priority element (smallest for a min-heap)
    public T remove() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Cannot remove from an empty priority queue");
        }

        T root = list.get(0); // Root element is the highest priority
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

    // Check if the priority queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Main method to test the PriorityQueue functionality
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.insert(10);
        pq.insert(5);
        pq.insert(20);
        pq.insert(3);
        pq.insert(15);

        // Display elements in order of priority
        while (!pq.isEmpty()) {
            System.out.println("Removed element with highest priority: " + pq.remove());
        }
    }
}
