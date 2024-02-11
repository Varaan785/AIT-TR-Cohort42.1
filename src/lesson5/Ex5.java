package lesson5;

public class Ex5 {
    public static void main(String[] args) {
        int t = 12;
        if (t > 28) {
            System.out.println("It´s Hot");
        } else {
            System.out.println("It´s NOT Hot");
        }

        System.out.println(t > 28? "It´s" : "It´s NOT hot");
    }
}