import java.util.Collections;
import java.util.List;

public class QuickSortStrategy extends SortStrategy {
    @Override
    public void sort(List<Integer> list) {
        quickSort(list, 0, list.size() - 1);
        System.out.println("QuickSort.");
    }

    private void quickSort(List<Integer> list, int start, int end) {
        if (start >= end) return;

        int pivotValue = list.get(end);
        int i = start;

        for (int j = start; j < end; j++) {
            if (list.get(j) < pivotValue) {
                Collections.swap(list, i, j);
                i++;
            }
        }
        Collections.swap(list, i, end);

        quickSort(list, start, i - 1);
        quickSort(list, i + 1, end);
    }
}
