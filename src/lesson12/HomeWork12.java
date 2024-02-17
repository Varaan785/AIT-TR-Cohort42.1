//package lesson12;
///**
// * AIT-TR, Cohoirt 42.1, Java Basic, HW #12
// * @author Valerian
// * @version 11-Feb-34
// */
//
//import java.util.Arrays;
//
//public class HomeWork12 {
//    public static int
//    lsearch(int[] array, int goal) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == goal) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int[] array = {64, 25, 12, 22, 11};
//
//        System.out.println("Original array: " + Arrays.toString(array));
//
//        public static void selectionSort selectionSort(array);
//
//        System.out.println("Sorted array: " + Arrays.toString(array));
//
//        // task #1
//        System.out.println("task #1");
//        int[] array = {1, 5, 7, 9, 13, 22, 35};
//        int targetElement = 9;
//        int position = lsearch(array, targetElement);
//        if (position != -1) {
//            System.out.println("Element" + targetElement + "found at position" + position);
//        } else {
//            System.out.println("Element" + targetElement + " not in Array find");
//        }
//        // task #2
//        System.out.println("task #2");
//        ( int[] array){
//            int n = array.length;
//
//            for (int i = 0; i < n - 1; i++) {
//                int minIndex = i;
//
//                for (int j = i + 1; j < n; j++) {
//                    if (array[j] < array[minIndex]) {
//                        minIndex = j;
//                    }
//                }
//
//                int temp = array[minIndex];
//                array[minIndex] = array[i];
//                array[i] = temp;
//
//
//            }
//        }
//    }
//
//}