package dependencyinversion.goodexample;

import dependencyinversion.goodexample.factory.EmployeePersistenceFactory;
import dependencyinversion.goodexample.persistence.EmployeePersistence;
import dependencyinversion.goodexample.persistence.ProgrammerMemoryPersistence;

import java.util.List;

public class Company {
    private final EmployeePersistence persistence;

    public Company(EmployeePersistenceFactory factory) {
        this.persistence = factory.getEmployeePersistence();
    }

    public List<Employee> getEmployees() {
        return persistence.findAll();
    }

    public void addEmployees(Employee employee) {
        persistence.save(employee);
    }
}
