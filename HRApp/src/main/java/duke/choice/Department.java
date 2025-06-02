package duke.choice;

public class Department {
    private String name;
    private Employee[] employees = new Employee[10];
    private int lastAddedEmployeeId = -1;

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        if (lastAddedEmployeeId < employees.length) {
            lastAddedEmployeeId++;
            employees[lastAddedEmployeeId] = employee;
        }
    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department: " + name;
    }
}
