package lesson23.homework;

import java.util.ArrayList;
import java.util.List;

public class ToWareHouse {
    private int id;
    private List<ProductAndCount> products;

    public ToWareHouse(int id) {
        this.id = id;
        this.products = new ArrayList<>();
    }

    public void add(Product product, int count) {
        products.add(new ProductAndCount(product, count));
    }
    public void toWarehouse(WareHouse wareHouse) {
        wareHouse.addAll(products);
    }

}
