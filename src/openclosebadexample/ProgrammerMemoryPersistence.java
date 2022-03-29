package openclosebadexample;

import java.util.ArrayList;
import java.util.List;

public class ProgrammerMemoryPersistence {

    private List<Programmer> programmers;

    public ProgrammerMemoryPersistence() {
        this.programmers = new ArrayList<>();
    }

    public List<Programmer> findAll() {
        return programmers;
    }

    public void save(Programmer programmer) {
        programmers.add(programmer);
    }
}
