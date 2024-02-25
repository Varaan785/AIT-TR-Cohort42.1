package lesson15;
/**
 * AIT-TR, Cohort 42.1, Java Basic, hw #15
 * CarHomeWork
 * @author Valerian
 * @version 20-Feb-34
 */

import java.util.Scanner;

public class CarHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
