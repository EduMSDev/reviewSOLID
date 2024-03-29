package openclosed.badexample;

/*If you want to create other types of workers that are not programmers,
you have to modify the class, which breaks the open-closed principle.*/
public class Programmer {

    private final String fullName;
    private final int salary;

    public Programmer(String fullName, int salary) {
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
