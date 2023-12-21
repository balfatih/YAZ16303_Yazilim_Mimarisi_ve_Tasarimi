import java.util.ArrayList;
import java.util.List;

public class Department implements Employee{

    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Department: " + name);
        System.out.println(name +" da çalışanların listesi: ");
        for (Employee employee:employees) {
            employee.showDetails();
        }
    }
}
