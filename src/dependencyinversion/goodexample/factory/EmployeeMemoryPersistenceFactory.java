package dependencyinversion.goodexample.factory;

import dependencyinversion.goodexample.persistence.EmployeePersistence;
import dependencyinversion.goodexample.persistence.ProgrammerMemoryPersistence;

public class EmployeeMemoryPersistenceFactory implements EmployeePersistenceFactory {
    @Override
    public EmployeePersistence getEmployeePersistence() {
        return new ProgrammerMemoryPersistence();
    }
}
