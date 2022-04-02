package liskovsubstitutionbadexample;

/*It states that a superclass object should be replaceable with
a subclass object without breaking the functionality of the software.*/
public class Mammal {

    private int weight;
    private int ageInDays;

    public int getWeight() {
        return weight;
    }

    public int getAgeInDays() {
        return ageInDays;
    }

    public void walk() {
        System.out.println("I am walking!");
    }
}
