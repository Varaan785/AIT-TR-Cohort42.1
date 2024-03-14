package lesson23.homework;
/**
 * AIT-TR, Cohoirt 42.1, Java Basic, HW #23
 * @author Valerian
 * @version 13-Mar-34
 */


public class HomeWork23 {
    public static void main(String[] args) {
        Product laptop = new Product("Lenova T590", 1000);
        Product TV = new Product("Samsung 34'", 800);

        WareHouse wareHouse = new WareHouse();
        System.out.println(wareHouse);

        ToWareHouse toWareHouse = new ToWareHouse(1);
        toWareHouse.add(laptop, 50);
        toWareHouse.add(TV, 50);
        toWareHouse.toWarehouse(wareHouse);
        System.out.println(wareHouse);

        Order order = new Order(2);
        order.add(laptop, 10);
        order.add(TV, 5);

        FromWareHouse fromWareHouse = new FromWareHouse(3);
        fromWareHouse.add(order);
        fromWareHouse.fromWareHouse(wareHouse);
        System.out.println(wareHouse);
    }
}
