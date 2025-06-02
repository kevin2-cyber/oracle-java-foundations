package duke.choice;

public class HRApp {
    public static void main(String[] args) {
        System.out.println("HRApp starts");

        Employee employee1 = new Employee(120, "John Doe", 1000.00);
        Employee employee2 = new Employee(125, "Grace Doe", 2000.00);
        System.out.println(employee1);
        System.out.println(employee2);
    }
}