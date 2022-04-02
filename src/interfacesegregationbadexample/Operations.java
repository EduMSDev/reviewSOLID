package interfacesegregationbadexample;

/*a client should not be exposed to methods it doesn’t need*/
public interface Operations {

    double add(double a, double b);

    double subtract(double a, double b);

    double multiply(double a, double b);

    double divide(double a, double b);

    double sine(double angle);

    double cosine(double angle);
}
