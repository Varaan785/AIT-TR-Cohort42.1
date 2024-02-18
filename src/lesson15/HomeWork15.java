package lesson15;


import java.util.Scanner;

public class HomeWork15 {
    public static void main(String[] args) {
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
    }
}
