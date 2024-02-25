package lesson18;

public class Robot {

    private int countCPU;

    private static int count;  //

    public Robot(int countcPU) {
        this.countCPU = countcPU;
        count++;

    }

    public  int getCount() {
        return count;

    }
    public int add(int a, int b) {
        return  a + b;
    }

    @Override
    public String toString() {
        return "Robot{}";
    }
}

