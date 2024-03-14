package lesson23.homework;

import java.util.ArrayList;
import java.util.List;

public class WareHouse {
    private List<ProductAndCount> products;
    public WareHouse() {
        products = new ArrayList<>();
    }
    public void addAll(List<ProductAndCount> products) {
        //TODO analize and find problem
        this.products.addAll(products);
    }

    public void deleteAll(List<ProductAndCount> products) {
        //TODO check count etc
        for (ProductAndCount pac : products) {
            Product p = pac.getProduct();
            for (ProductAndCount wpac : this.products) {
                if (wpac.getProduct().equals(p)) {
                    wpac.setCount(wpac.getCount() - pac.getCount());
                }
            }
        }
    }

    @Override
    public String toString() {
        return "WareHouse{" + products + '}';
    }
}
