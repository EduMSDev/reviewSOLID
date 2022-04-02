package dependencyinversion.goodexample;

import dependencyinversion.goodexample.factory.EmployeeMysqlPersistenceFactory;

public class Main {

    public static void main(String[] args) {
        Company company = new Company(new EmployeeMysqlPersistenceFactory());
    }
}
