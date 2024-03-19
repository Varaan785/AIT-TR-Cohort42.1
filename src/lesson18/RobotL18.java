package lesson18;
/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #18
 * Robot
 * @author Valerian
 * @version 23-Feb-34
 */


public class RobotL18 {

    public static final String COMPANY_NAME = "Boston Dynamics";

    private int countCPU;
    private int sum;

    private static int count;

    public RobotL18(int countPU) {
        this.countCPU = countPU;
        this.sum = 0;
        count++;

    }

    public static int getCount() {
        return count;

    }
    public static int add(int a, int b) {
        return  a + b;
    }

    public void addAndSave(int a) {
        sum += a;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "countCPU=" + countCPU +
                '}';
    }
}

