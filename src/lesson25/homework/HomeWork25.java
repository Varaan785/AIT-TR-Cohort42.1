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
        System.out.println("Person:          " + person.run() + " needs to repose" + person.repose());
        AmateurAthlete amateurAthlete = new AmateurAthlete();
        System.out.println("Amateur Athlete: " + amateurAthlete.run() + " needs to repose " + amateurAthlete.repose());
        ProfessionalAthlete professionalAthlete = new ProfessionalAthlete();
        System.out.println("Prof. Athlete:   " + professionalAthlete.run() + " needs to repose" + professionalAthlete.repose());

        // task #2
        System.out.println("task #2");
        
    }
}
