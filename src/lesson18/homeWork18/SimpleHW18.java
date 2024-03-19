package lesson18.homeWork18;
/**
 * AIT-TR, Cohoirt 42.1, Java Basic, HW #18
 * SimpleHW18
 * @author Valerian
 * @version 25-Feb-34
 */

import java.io.PrintStream;

public class SimpleHW18 {
    public static PrintStream out;
    private static int count;

    public SimpleHW18() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
