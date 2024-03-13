package lesson25;
/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #25
 *
 * @author Valerian
 * @version 11-Mar-34
 */

public class Lesson25 {
    public static void main(String[] args) {
        Animal25 animal25 = new Animal25();
        System.out.println(animal25.voice());

//        Animal25 cat25 = new Cat25();   //Cat25
//        System.out.println(cat25.voice());
//
//        Animal25 dog25 = new Dog25();    //Dog25
//        System.out.println(dog25.voice());

        Animal25[] animal25s = {new Cat25(), new Dog25(),new Hen()};
        for (Animal25 a : animal25s) {
            System.out.println(a.voice());
        }
    }
}
