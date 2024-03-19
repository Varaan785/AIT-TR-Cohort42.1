package lesson19;
/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #19
 *
 * @author Valerian
 * @version 26-Feb-34
 */

public class Lesson19 {
    public static void main(String[] args) {
        RubberArrayL19 ra = new RubberArrayL19();
        ra.add(8);
        ra.add(12);
        ra.add(-1);
        ra.add(3);
        ra.add(25);
        System.out.println(ra);
        System.out.println(ra.get(2));
        ra.remove(2);
        System.out.println(ra);
    }
}
