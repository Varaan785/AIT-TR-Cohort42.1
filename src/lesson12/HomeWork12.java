package lesson12;

public class HomeWork12 {
    public static int
    lsearch(int[] array, int goal) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == goal) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        // task #1
        System.out.println("task #1");
        int[] array = {1, 5, 7, 9, 13, 22, 35};
        int targetElement = 9;
        int position = lsearch(array, targetElement);
        if (position != -1) {
            System.out.println("Element" + targetElement + "found at position" + position);
        } else {
            System.out.println("Element" + targetElement + " not in Array find");
        }
        // task #2
        System.out.println("task #2");

    }

}