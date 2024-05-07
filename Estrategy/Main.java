public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 3, 1, 7, 4, 6};

        Sorter sorter = new Sorter();

        // Utilizando BubbleSort
        sorter.setSortingStrategy(new BubbleSort());
        sorter.sort(array);

        // Utilizando InsertionSort
        sorter.setSortingStrategy(new InsertionSort());
        sorter.sort(array);
    }
}