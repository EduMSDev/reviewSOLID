package dependencyinversion.goodexample;

public class Employee {

    private final String fullName;
    private final int salary;

    public Employee(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }
}
