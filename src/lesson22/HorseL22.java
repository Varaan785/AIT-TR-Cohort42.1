package lesson22;
/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #22
 * HorseL22
 * @author Valerian
 * @version 4-Mar-34
 */

public class HorseL22 {
    private String name;
    public HorseL22(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("run...");
    }

    public void walk() {
        System.out.println("walk...");
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }
}
