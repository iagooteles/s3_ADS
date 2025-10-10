import java.util.List;

public class ShellSort extends SortStrategy {
    @Override
    public void sort(List<Integer> list) {
        int length = list.size();

        // Começa com gap metade do tamanho do array, vai diminuindo até 1
        for (int gap = length / 2; gap > 0; gap /= 2) {
            for (int currentIndex = gap; currentIndex < length; currentIndex++) {
                int currentValue = list.get(currentIndex);
                int position = currentIndex;

                while (position >= gap && list.get(position - gap) > currentValue) {
                    list.set(position, list.get(position - gap));
                    position -= gap;
                }

                list.set(position, currentValue);
            }
        }
        System.out.println("ShellSort.");
    }
}
