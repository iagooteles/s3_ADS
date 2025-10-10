import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList lista = new MyList();

        List<Integer> numeros = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 7, 13, 20, 10, 999, 478, 32, 87));

        System.out.println("Lista original:");
        System.out.println(numeros);

        // QuickSort (default)
        lista.sort(numeros);
        System.out.println(numeros);
        System.out.println("_____________________________________________________________");

        // ShellSort
        numeros.clear();
        numeros.addAll(Arrays.asList(5, 2, 9, 1, 7, 13, 20, 10, 999, 478, 32, 87));

        System.out.println("Lista original:");
        System.out.println(numeros);

        lista.setSortStrategy(new ShellSort());
        lista.sort(numeros);

        System.out.println(numeros);
        System.out.println("_____________________________________________________________");

        // HeapSort
        numeros.clear();
        numeros.addAll(Arrays.asList(5, 2, 9, 1, 7, 13, 20, 10, 999, 478, 32, 87));

        System.out.println("Lista original:");
        System.out.println(numeros);

        lista.setSortStrategy(new HeapSort());
        lista.sort(numeros);
        System.out.println(numeros);
        System.out.println("_____________________________________________________________");
    }
}
