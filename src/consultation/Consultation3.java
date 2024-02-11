package consultation;

import java.util.Scanner;

public class Consultation3 {
    private static String line;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = line.split("");
        do {
            System.out.println(" # ");
            line = scanner.nextLine();
            String[] tokens = line.split(" ");
            //System.out
            switch (line) {
                case "print":
                    assingValue(line);
                    break;
                case "exit":
                    System.out.println("Exit from inerpreter.");
                    break;
                default:
                    assingValue(line);
            }
        } while (!line.equals("exit"));
    }

    private static void assingValue(String line) {
        
    }

    static void assignValue(String line) {
    String[] tokens = line.split("=");
    String varName = tokens[0].trim();
    String varValue = tokens[1].trim();
    // transform 'a' -> 0
    int idx = varName.charAt(0) - 'a';
    // transform "123" -> 123
    int value = Integer.valueOf(varValue);
    // assign value
        int[] values = new int[0];
        values[idx] = value;
}

    static void printValue(String varName) {
        int idx = varName.charAt(0) - 'a';
        boolean[] values = new boolean[0];
        System.out.println(values[idx]);
    }
}
