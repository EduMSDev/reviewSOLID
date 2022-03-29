package openclosebadexample;

import java.util.List;

public class Company {
    private ProgrammerMemoryPersistence persistence;

    public Company() {
        this.persistence = new ProgrammerMemoryPersistence();
    }

    public List<Programmer> getProgrammers() {
        return persistence.findAll();
    }

    public void addProgrammer(String fullname, int salary) {
        persistence.save(new Programmer(fullname, salary));
    }
}
