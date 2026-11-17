package Collections.Map;
import java.util.*;
/*
 * Q5. Group Objects by Property
 * Group Employee objects by department using a Map.
 */
public class GroupEmployees {
    enum Department {
        HR, IT
    }
    static class Employee {
        String name;
        Department department;
        Employee(String name, Department department) {
            this.name = name;
            this.department = department;
        }
        @Override
        public String toString() {
            return name;
        }
    }
    // Group employees based on their department
    public static Map<Department, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<Department, List<Employee>> grouped = new LinkedHashMap<>();
        for (Employee emp : employees) {
            // Create a list for each department if absent
            grouped.putIfAbsent(emp.department, new ArrayList<>());
            // Add the employee to the corresponding department
            grouped.get(emp.department).add(emp);
        }
        return grouped;
    }
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", Department.HR),
                new Employee("Bob", Department.IT),
                new Employee("Carol", Department.HR)
        );
        Map<Department, List<Employee>> result = groupByDepartment(employees);
        for (Map.Entry<Department, List<Employee>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}