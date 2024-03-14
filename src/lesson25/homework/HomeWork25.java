package lesson25.homework;
/**
 * AIT-TR, Cohoirt 42.1, Java Basic, HW #25
 * @author Valerian
 * @version 13-Mar-34
 */

public class HomeWork25 {
    public static void main(String[] args) {
        Person person = new Person();

        // task #1
        System.out.println("task #1");
        Person[] person1 =  {new AmateurAthlete(), new ProfessionalAthlete()};
        for (Person a : person1) {
            System.out.println(a.run() + a.repose());
        }


        // task #2
        System.out.println();
        System.out.println("task #2");
        
    }
}
