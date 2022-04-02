package dependencyinversion.goodexample.factory;

import dependencyinversion.goodexample.persistence.EmployeePersistence;

public interface EmployeePersistenceFactory {
    EmployeePersistence getEmployeePersistence();
}
