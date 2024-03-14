package lesson23.homework;

import java.util.List;

public class BaseDocument {
    private int id;
    private List<ProductAndCount> products;
    public BaseDocument(int id) {
        this.id = id;
    }
}
