package duke.choice;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class HRApp {
    private static final Logger LOGGER = Logger.getLogger(HRApp.class.getName());
    public static void main(String[] args) {
        System.out.println("HRApp starts");

        Employee education1 = new Employee(120, "John Doe", 1000.00);
        Employee education2 = new Employee(125, "Grace Doe", 2000.00);

        Department education = new Department("Education");
        System.out.println(education);
        education.addEmployee(education1);
        education.addEmployee(education2);

        Employee[] educationEmployees = education.getEmployees();
        for (Employee emp : educationEmployees) {
            System.out.println(emp);
        }
        System.out.println("total salary: " + education.getTotalSalary());
        System.out.println("average salary: " + education.getAverageSalary());

        Employee computer1 = new Employee(130, "Cole", 3000.00);
        Employee computer2 = new Employee(135, "Jack", 4000.00);

        Department computer = new Department("Computer");
        System.out.println(computer);
        computer.addEmployee(computer1);
        computer.addEmployee(computer2);

        Employee[] computerEmployees = computer.getEmployees();
        for (Employee emp : computerEmployees) {
            System.out.println(emp);
        }
        System.out.println("total salary: " + computer.getTotalSalary());
        System.out.println("average salary: " + computer.getAverageSalary());

        System.out.println(computer.getEmployeeById(1302));
        Employee[] allEmployees = mergeEmployeesUsingStreams(educationEmployees, computerEmployees);

        try {
            ItemList list = new ItemList(allEmployees);
            Routing routing = Routing.builder()
                    .get("/items", list)
                    .build();

            ServerConfiguration config = ServerConfiguration.builder()
                    .bindAddress(InetAddress.getLocalHost())
                    .port(8888).build();

            WebServer ws = WebServer.create(config, routing);
            ws.start();
        } catch (UnknownHostException ex) {
            LOGGER.log(Level.INFO, ex.getMessage(), ex);
        }
    }
    public static Employee[] mergeEmployeesUsingStreams(Employee[] educationEmployees, Employee[] computerEmployees) {
        return Stream.concat(
                Arrays.stream(educationEmployees),
                Arrays.stream(computerEmployees))
                .toArray(Employee[]::new);
    }

}