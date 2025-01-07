
import java.util.*;

public class HeapQuestion<T extends Comparable<T>> {

    private ArrayList<T> list;

    // Constructor
    public HeapQuestion() {
        list = new ArrayList<>();
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    public void insert(T value) {
        list.add(value);
        heapifyUp(list.size() - 1);
    }

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

    public T remove() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Cannot remove from an empty heap");
        }

        T temp = list.get(0);
        T last = list.remove(list.size() - 1);

        if (!list.isEmpty()) {
            list.set(0, last);
            heapifyDown(0);
        }

        return temp;
    }

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

    public static void main(String[] args) {
        try {
            HeapQuestion<Integer> heap = new HeapQuestion<>();
            heap.insert(10);
            heap.insert(5);
            heap.insert(20);
            heap.insert(3);

            System.out.println("Removed element: " + heap.remove());
            System.out.println("Removed element: " + heap.remove());

            // Testing removing all elements
            System.out.println("Removed element: " + heap.remove());
            System.out.println("Removed element: " + heap.remove());

            // Edge case: Trying to remove from an empty heap
            System.out.println("Removed element: " + heap.remove());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
