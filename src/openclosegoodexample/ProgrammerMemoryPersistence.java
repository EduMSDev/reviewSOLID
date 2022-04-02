package openclosegoodexample;

import java.util.ArrayList;
import java.util.List;

public class ProgrammerMemoryPersistence implements EmployeePersistence {

    private final List<Employee> employees;

    public ProgrammerMemoryPersistence() {
        this.employees = new ArrayList<>();
    }

    public List<Employee> findAll() {
        return employees;
    }

    public void save(Employee employee) {
        employees.add(employee);
    }
}
