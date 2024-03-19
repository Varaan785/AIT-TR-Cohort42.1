package lesson19.homeWork19;
/**
 * AIT-TR, Cohoirt 42.1, Java Basic, HW #19
 *
 * @author Valerian
 * @version 28-Feb-34
 */

public class HomeWork19 {
    public static void main(String[] args) {

        //task #1
        System.out.println("task #1");
        RubberArrayHW19 rb = new RubberArrayHW19();
        rb.add(8);
        rb.add(4);
        rb.add(-3);
        rb.add(12);
        rb.add(1);
        System.out.println(rb);
        //task #2
        System.out.println("task #2");
        System.out.println(rb.contains(12));
        System.out.println(rb.indexOf(5));
    }
}
