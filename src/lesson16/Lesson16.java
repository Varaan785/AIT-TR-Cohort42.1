package lesson16;
/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #16
 *
 * @author Valerian
 * @version 19-Feb-34
 */

public class    Lesson16 {
    public static void main(String[] args) {
        CatL16 cat = new CatL16(30);
        Plate plate = new Plate(50);

        plate.add(40);
        cat.eat(plate);
//        plate.feeding(plate.amountFood());

        System.out.println("Cat" + cat.raelVolume);
        System.out.println("Plate" + plate.food);

    }
}
