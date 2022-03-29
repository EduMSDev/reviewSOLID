package openclosegoodexample;

import java.util.List;

public class Company {
    private EmployeePersistence persistence;

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
