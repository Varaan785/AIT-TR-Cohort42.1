package lesson22;
/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #22
 * PegasL22
 * @author Valerian
 * @version 4-Mar-34
 */

public class PegasL22 extends HorseL22 {
    private int wingsCount;
    public PegasL22(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("fly...");
    }
}
