package lesson15;
/**
 * AIT-TR, Cohort 42.1, Java Basic, HW #15
 *
 * @author Valerian
 * @version 16-Feb-34
 */
public class Lesson15 {
    public static void main(String[] args) {
        int a = 10;
        Cat cat = new Cat();
        cat.name = "Murzik";
        cat.color= "white";
        cat.age = 3;
        cat.voice();
        System.out.println(cat.name + " ," + cat.color + " ," + cat.age);

        Cat cat1 = new Cat();
        cat1.name = "Barsik";
        cat1.color= "black";
        cat1.age = 5;
        cat1.voice();
        System.out.println(cat1.name + " ," + cat1.color + " ," + cat1.age);

    }
}
