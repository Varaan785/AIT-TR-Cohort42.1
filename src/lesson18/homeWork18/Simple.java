package lesson18.homeWork18;

import java.io.PrintStream;

public class Simple {
    public static PrintStream out;
    private static int count;

    public Simple() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
