package dependencyinversion.badexample;

import java.util.List;

/*high level modules should not depend on low level modules; both should depend on abstractions.
Abstractions should not depend on details.  Details should depend upon abstractions */
public class Company {
    private final EmployeePersistence persistence;

    /*This class still depends on implementations and not abstractions,
    this breaking the dependency inversion principle. */
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
