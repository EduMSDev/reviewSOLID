package openclosebadexample;

/*If you want to create other types of workers that are not programmers,
you have to modify the class, which breaks the open-closed principle.*/
public class Programmer {

    private String fullName;
    private int salary;

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
