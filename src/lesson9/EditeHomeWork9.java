package lesson9;

import java.util.Arrays;

/**
 * AIT-TR cohort 42-1, Java Basic, hw #9
 * @autor Valerian
 * @version 6.Feb.2024
 */

public class EditeHomeWork9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        // task #1
        task1(5);

        // task #2
        printArray(array);

        // task #3
        printArray(array, false);
        printArray(array, true);

        // task #4
        System.out.println(Arrays.toString(calculateArray(array)));


    }

    public static void task1(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Task" + i);
        }
    }

    public static void printArray(int[] a) {
        for (int i = a.length - 1; i > -1; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] a, boolean reverseDirection) {
        if (reverseDirection) {
            printArray(a);
        } else {
            for (int i : a) {
                System.out.println(i + " ");
            }
            System.out.println();
        }
    }

    public static double[] calculateArray(int[] a) {
        int max = a[0];
        int min = a[0];
        double sum = 0;
        for (int i : a) {
            sum += i;
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        double[] result = {min, max, sum / a.length} ;
        return result;
    }

}