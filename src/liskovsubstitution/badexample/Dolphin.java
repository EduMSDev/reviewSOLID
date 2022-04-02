package liskovsubstitution.badexample;

/*This class broke the application,
since replacing this class with any other would break the application.*/
public class Dolphin extends Mammal {

    @Override
    public void walk() {
        throw new CannotWalkException("I am dolphin i canot walk");
    }
}
