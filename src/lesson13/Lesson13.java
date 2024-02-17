package lesson13;
/**
 * AIT-TR, Cohoirt 42.1, Java Basic, Lesson #13
 *
 * @author Valerian
 * @version 12-Feb-2024
 */

import lesson9.EditeHomeWork9;



public class Lesson13 {
    public static void main(String[] args) {
        int[] array = A001.createRandomArray(100_000, 100);

        long startTime = System.currentTimeMillis();
        System.out.println(A002.binarySearch(array, 45));
        System.out.println((System.currentTimeMillis()- startTime) + " ms");

        A002.selectionSort(array);

        startTime = System.currentTimeMillis();
        System.out.println(A002.binarySearch(array, 45));
        System.out.println(System.currentTimeMillis() - startTime + " s");
    }
}
