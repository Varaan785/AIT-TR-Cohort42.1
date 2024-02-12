package lesson13;

public class A002 {
    public static int binarySearch(int[] a, int n) {
        int left = 0, right = a.length - 1;
        while (left + 1 != right) {
            int middle = left + (right - left) / 2;
            if (a[middle] == n) {
                return middle;
            }
            if (a[middle] > n) {
                right = middle;
            } else {
                left = middle;
            }
        }
        return -1;
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i + 1];
            int minIdx = i + 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minIdx = j;
                }
            }
            if (a[i] > min) {
                a[minIdx] = a[i];
                a[i] = min;
            }
        }
    }
}
