package lesson17;
/**
 * AIT-TR, Cohort 42.1, Java Basic, hw #17
 *
 * @author Valerian
 * @version 20-Feb-34
 */

public class EditedHomeWork17 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("a1", "d1", "e1", "t1", 1000, 40),
                new Employee("a2", "d2", "e2", "t2", 1200, 43),
                new Employee("a3", "d3", "e3", "t3", 800, 37)
        };
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee.getName() + ", " +
                        employee.getPosition() + ", " +
                        employee.getEmail() + ", " +
                        employee.getPhone() + ", " +
                        employee.getSalary() + ", " +
                        employee.getAge());
            }
        }
    }
}
