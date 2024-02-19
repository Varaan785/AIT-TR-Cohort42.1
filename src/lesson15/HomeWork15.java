package lesson15;
/**
 * AIT-TR, Cohort 42.1, Java Basic, hw #15
 *
 * @author Valerian
 * @version 18-Feb-34
 */


import java.util.Scanner;

public class HomeWork15 {

    public static void main(String[] args) {

        //task Cat
        System.out.println("task #Cat");
        Scanner scanner = new Scanner(System.in);
        CatHW myCat = new CatHW("Bagira", "Orange", 2, 100 );
        System.out.println("My name is " + myCat.name + " color ," + myCat.color + "my age is ," + myCat.age + "My Energy :" + myCat.energyLevel);
        System.out.println("Initiel energy level:" + myCat.getEnergyLevel());
        System.out.println("Enter activity for Boris [eat/sleep/walk/run/play]: ");
        do {
        String activity = scanner.nextLine();
        myCat.voice();

            switch (activity) {
                case "eat":
                    myCat.eat();
                    System.out.println("Energy level after eating: " + myCat.getEnergyLevel());
                    myCat.voice();
                    break;
                case "sleep":
                    myCat.sleep();
                    System.out.println("Energy level after sleeping: " + myCat.getEnergyLevel());
                    break;
                case "run":
                    myCat.run();
                    System.out.println("Energy level after running:" + myCat.getEnergyLevel());
                    break;
                case "play":
                    myCat.play();
                    System.out.println("Energy level after play: " + myCat.getEnergyLevel());
                    break;
                case "walk":
                    myCat.walk();
                    System.out.println("Energy level after walking: " + myCat.getEnergyLevel());
                    break;
                default:
                    System.out.println("Bay bay");
            }
        } while (myCat.energyLevel > 0 && myCat.energyLevel < 110);
        System.out.println("Cat is DEAD");

        //taskCar
        System.out.println("task #Car");
        double fuelLevel = 30.0;
        System.out.println("Car starten...");
        if (fuelLevel > 0) {
            System.out.println("Car started. Fuel level: " + fuelLevel + " Liter.");
            System.out.print("Indicate how many kilometers you would like to drive: ");
            double plannedRoute = scanner.nextDouble(); // Assumption: consumption of 10 liters per 100 km
            if (plannedRoute <= fuelLevel * 10) {
                System.out.println("You can see the planned route from " + plannedRoute + " km drive.");
            } else {
                System.out.println("Not enough gas for the planned route.");
            }
        } else {
            System.out.println("Car could not be started. Not enough gasoline available.");
        }

        scanner.close();
    }
}





