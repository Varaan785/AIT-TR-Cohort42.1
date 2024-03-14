package lesson23.homework;

import java.util.List;

public class WareHouse {
    private List<ProductAndCount> products;
    public void addAll(List<ProductAndCount> products) {
        this.products.addAll(products);
    }
}
