package lesson18;
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

        System.out.println(RobotL18.COMPANY_NAME);

        RobotL18 robot = new RobotL18(8);
        System.out.println(robot);
        System.out.println(RobotL18.getCount());
        System.out.println(RobotL18.add(2, 2));
        robot.addAndSave(5);
        robot.addAndSave(12);
        System.out.println(robot.getSum());

        RobotL18 r2d2 = new RobotL18(2);
        System.out.println(r2d2);
        System.out.println(RobotL18.getCount());
        System.out.println(r2d2.getSum());
    }
}
