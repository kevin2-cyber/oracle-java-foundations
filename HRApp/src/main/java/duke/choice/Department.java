package duke.choice;

public class Department {
    private String name;
    private Employee[] employees = new Employee[10];
    private int lastAddedEmployeeIndex = -1;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     Increment lastAddedEmployeeIndex and add employee to this position in the employees array.
     When adding new employee to the employees array, consider the length of the array.
     You can simply stop adding extra employees once you have reached your employee array capacity
     */
    public void addEmployee(Employee employee) {
        if (lastAddedEmployeeIndex < employees.length) {
            lastAddedEmployeeIndex++;
            employees[lastAddedEmployeeIndex] = employee;
        }
    }

    /**
     The idea of this algorithm is to return an array of employees that contains the exact number
     of elements that matches the actual number of employees in this department.
     This can be calculated by adding one to the lastAddedEmployeeIndex variable.
     You then need to copy references for relevant employee object from the employees array to this new
     array and return it to the invoker.
     This way invoker always gets an array that is already trimmed to exact required size.
     */
    public Employee[] getEmployees() {
        Employee[] actualEmployees = new Employee[lastAddedEmployeeIndex + 1];

        for (int i = 0; i < actualEmployees.length; i++) {
            actualEmployees[i] = employees[i];
        }
        return actualEmployees;
    }

    /**
     Variable lastAddedEmployeeIndex indicates last valid position in the employees array.
     Because array indexing starts at zero, you need to add one to get the number of elements.
     */
    public int getEmployeeCount() {
        return lastAddedEmployeeIndex + 1;
    }

    // query method that attempts to locate an employee with specific id in this department.
    public Employee getEmployeeById(int empId) {
        for (Employee emp: employees) {
            if (emp != null) {
                if (emp.getId() == empId) {
                    return emp;
                }
            }
        }
        return null;
    }

    /**
     You may reserve a local variable, assign employee object to this variable
     and break out of the loop, when required employee has been located.
     */
    public Employee getEmpById(int empId) {
        Employee result = null;
        for (Employee emp: employees) {
            if (emp.getId() == empId) {
                result = emp;
                break;
            }
        }
        return result;
    }

    /**
     Because employees array may be partially filled values, you need to start at position zero
     and stop at the element indicated by the lastAddedEmployeeIndex variable.
     Calculate running total value and return the result.
     */
    public double getTotalSalary() {
        double totalSalary = 0.0;
        for (int i = 0; i <= lastAddedEmployeeIndex; i++) {
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }

    /**
     To calculate average salary you need to calculate total and divide it by the number of elements.
     You already have a method that does total calculation.
     You can find out the number of employees in the array by adding one to the lastAddedEmployeeIndex variable.
     If there are no employees in the array then you can return zero as the average does not make much sense in this case;
     */
    public double getAverageSalary() {
        if (lastAddedEmployeeIndex > -1) {
            return getTotalSalary() / (lastAddedEmployeeIndex + 1);
        }
        return 0;
    }


    @Override
    public String toString() {
        return "Department: " + name;
    }
}
