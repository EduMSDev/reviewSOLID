package dependencyinversion.goodexample.persistence;

import dependencyinversion.goodexample.Employee;

import java.util.List;

public interface EmployeePersistence {

    List<Employee> findAll();

    void save(Employee employee);
}
