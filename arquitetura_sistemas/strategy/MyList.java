import java.util.List;

public class MyList {
    private SortStrategy strategy;

    public MyList() {
        this.strategy = new QuickSortStrategy();
    }
    
    public void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(List<Integer> list) {
        this.strategy.sort(list);
    }
}
