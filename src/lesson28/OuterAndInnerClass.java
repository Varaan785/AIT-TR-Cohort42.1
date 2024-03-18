package lesson28; //TODO nicht fertig
/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #28
 * OuterAndInnerClass
 * @author Valerian
 * @version 18-Mar-34
 */

public class OuterAndInnerClass {
    private String field = "field";

    private void printText(){
        System.out.println("privet method print Text.");
    }
    public void useInnerClass() {
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.getField());
        innerClass.innerPrintText();
    }

    private class InnerClass {
        String getField() {
            return field;
        }
        void innerPrintText(){
            printText();
        }
    }
}
