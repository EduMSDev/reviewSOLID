package openclosed.goodexample;

import java.util.List;

public interface EmployeePersistence {

    List<Employee> findAll();

    void save(Employee employee);
}
