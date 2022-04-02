package dependencyinversion.goodexample.factory;

import dependencyinversion.goodexample.persistence.EmployeeMysqlPersistence;
import dependencyinversion.goodexample.persistence.EmployeePersistence;

public class EmployeeMysqlPersistenceFactory implements EmployeePersistenceFactory {
    @Override
    public EmployeePersistence getEmployeePersistence() {
        return new EmployeeMysqlPersistence("url", "user", "password");
    }
}
