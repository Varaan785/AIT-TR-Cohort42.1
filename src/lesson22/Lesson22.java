package lesson22;
/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #22
 *
 * @author Valerian
 * @version 4-Mar-34
 */

public class Lesson22 {
    public static void main(String[] args) {
        HorseL22 horseL22 = new HorseL22("Tunder");
        System.out.println(horseL22);
        horseL22.run();
        horseL22.walk();

        PegasL22 pegas = new PegasL22("Pegas");
        System.out.println(pegas);
        pegas.run();
        pegas.walk();
        pegas.fly();
    }
}
