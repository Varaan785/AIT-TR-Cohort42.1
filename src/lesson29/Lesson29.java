package lesson29;
/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #29
 *
 * @author Valerian
 * @version 20-Mar-34
 */

public class Lesson29 {
    public static void main(String[] args) {
        RubberListL29 rubberListL29 = new RubberListL29();
        System.out.println(rubberListL29);
        rubberListL29.add(20);
        rubberListL29.add(3);
        rubberListL29.add(-8);
        rubberListL29.add(2024);
        rubberListL29.add(1);
        rubberListL29.add(-5);
        System.out.println(rubberListL29);
        // get
        System.out.println(rubberListL29.get(2));
        System.out.println(rubberListL29.get(3));
        System.out.println(rubberListL29.get(-1));
        System.out.println(rubberListL29.get(6));
        // remove
        rubberListL29.remove(0);
        System.out.println(rubberListL29);
        rubberListL29.remove(2);
        System.out.println(rubberListL29);


    }

}
