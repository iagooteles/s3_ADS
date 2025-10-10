import java.util.List;

public class HeapSort extends SortStrategy {
    @Override
    public void sort(List<Integer> list) {
        int n = list.size();

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = list.get(0);
            list.set(0, list.get(i));
            list.set(i, temp);

            heapify(list, i, 0);
        }
        System.out.println("HeapSort.");
    }

    private void heapify(List<Integer> list, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < heapSize && list.get(leftChild) > list.get(largest)) {
            largest = leftChild;
        }

        if (rightChild < heapSize && list.get(rightChild) > list.get(largest)) {
            largest = rightChild;
        }

        if (largest != rootIndex) {
            int swap = list.get(rootIndex);
            list.set(rootIndex, list.get(largest));
            list.set(largest, swap);

            heapify(list, heapSize, largest);
        }
    }
}
