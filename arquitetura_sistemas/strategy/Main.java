public class Main {
    public static void main(String[] args) {
        MyList lista = new MyList();
        lista.sort();

        lista.setSortStrategy(new ShellSort());
    }
}
