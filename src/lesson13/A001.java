package lesson13;

import java.util.Random;

public class A001 {
    public static int[] createRandomArray(int len, int bound) {
    int[] a = new int[len];
    Random random = new Random();
    for (int i = 0; i < a.length; i++) {
        a[i] = random.nextInt(bound);
    }
    return a;
}
}
