package lesson23.homework;


public class ToWareHouse extends BaseDocument{

    public ToWareHouse(int id) {
        super(id);
    }

    public void toWarehouse(WareHouse wareHouse) {
        wareHouse.addAll(products);
    }

}
