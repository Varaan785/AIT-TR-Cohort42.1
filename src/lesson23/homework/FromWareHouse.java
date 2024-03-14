package lesson23.homework;

public class FromWareHouse extends BaseDocument{

    public FromWareHouse(int id) {
        super(id);
    }
    public void add(Order order) {
        products = order.getProducts();

    }

    public void fromWareHouse(WareHouse wareHouse) {
        wareHouse.deleteAll(products);
    }
}
