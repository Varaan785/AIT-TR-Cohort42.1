package lesson15;
/**
 * AIT-TR, Cohort 42.1, Java Basic, hw #15
 * CatHomeWork
 * @author Valerian
 * @version 18-Feb-34
 */

public class CatHW {
    String name, color;
    int age, energyLevel,eat,play,run,walk;

    public CatHW(String name, String color, int age, int initialEnergy) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.energyLevel = initialEnergy;
        this.eat = eat;
        this.play = play;
        this.run = run;
        this.walk = walk;
    }

    public void eat() {
        System.out.println("Cat is eating...");
        energyLevel += 10;
    }

    public void sleep() {
        System.out.println("Cat is sleep");
        energyLevel += 20;
    }

    public void play() {
        System.out.println("Cat is playing");
        energyLevel -= 15;
    }

    public void run() {
        System.out.println("Cat is running");
        energyLevel -= 30;
    }

    public void walk() {
        System.out.println("Cat is walging");
        energyLevel -= 5;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }
    public void voice() {
        System.out.println("Meow!");
    }
}


