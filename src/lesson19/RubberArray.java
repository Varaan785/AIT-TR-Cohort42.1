package lesson19;

public class RubberArray {
    private final int INIT_DATA_SIZE = 10;
    private int[] data;
    private int length;

    public RubberArray() {
        data = new int[INIT_DATA_SIZE];
        length = 0;
    }

    public void add(int value) {
        data[length] = value;
        length++;
    }
}
