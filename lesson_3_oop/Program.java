import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Employee[] employees = EmployeeFabric.generateEmployees(15);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new AgeComparator());

        System.out.println();
        System.out.println("***");
        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

}
