package lesson18;

import java.security.spec.RSAOtherPrimeInfo;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #18
 *
 * @author Valerian
 * @version 23-Feb-34
 */

public class Lesson18 {
    public static void main(String[] args) {
        final int a;
        a = 10;
        //a = 5 + 1; compile error

        Robot.count = -1,

        Robot robot = new Robot(8);
        System.out.println(robot);
        System.out.println(robot.getCount());
        System.out.println(robot.add(2, 2));

        Robot r2d2 = new Robot(2);
        System.out.println(r2d2);
        System.out.println(Robot.getCount());
    }
}
