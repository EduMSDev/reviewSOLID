package openclosebadexample;

import java.util.ArrayList;
import java.util.List;

/*If you want to create another type of persistence,
you have to modify the class, which breaks the open-closed principle.*/
public class ProgrammerMemoryPersistence {

    private final List<Programmer> programmers;

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
