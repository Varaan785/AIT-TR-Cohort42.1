package lesson23;

import lesson22.TriangleRectangle;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #23
 *
 * @author Valerian
 * @version 06-Mar-34
 */

public class Lesson23 {
    public static void main(String[] args) {
        Lesson23 lesson23 = new Lesson23();
        //toString()
        System.out.println(lesson23);
        //hashCode()
        System.out.println(Integer.toHexString(lesson23.hashCode()));
        //getCalss
        System.out.println(lesson23.getClass().getName());   //getSimpleName
        //equals
        String s1 = "qwerty";
        String s2 = "qwerty";
        String s3 = "wert";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        TriangleRectangle tr1 = new TriangleRectangle(4,6);
        TriangleRectangle tr2 = new TriangleRectangle(4,6);
        System.out.println("triangles: " + tr1.equals(tr2));

        // notify, notifyAll, wait - multithreading
    }

    @Override
    public String toString() {
        return "Lesson23{}";
    }
}
