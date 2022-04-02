package dependencyinversion.goodexample.persistence;

import dependencyinversion.goodexample.Employee;

import java.util.List;

public class EmployeeMysqlPersistence implements EmployeePersistence {

    public EmployeeMysqlPersistence(String url, String user, String pass) {

    }

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public void save(Employee employee) {

    }
}
