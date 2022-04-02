package openclosed.goodexample;

import java.util.List;

public class Company {
    private final EmployeePersistence persistence;

    public Company() {
        this.persistence = new ProgrammerMemoryPersistence();
    }

    public List<Employee> getEmployees() {
        return persistence.findAll();
    }

    public void addEmployees(Employee employee) {
        persistence.save(employee);
    }
}
