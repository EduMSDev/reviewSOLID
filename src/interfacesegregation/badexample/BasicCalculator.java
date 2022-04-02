package interfacesegregation.badexample;

/*This class breaks with the principle of interface segregation,
since it is extending an interface with operations that it does not need. */
public class BasicCalculator implements Operations {
    @Override
    public double add(double a, double b) {
        return 0;
    }

    @Override
    public double subtract(double a, double b) {
        return 0;
    }

    @Override
    public double multiply(double a, double b) {
        return 0;
    }

    @Override
    public double divide(double a, double b) {
        return 0;
    }

    @Override
    public double sine(double angle) {
        throw new UnsupportedOperationException("Basic calculator not suppor trigonometric operations");
    }

    @Override
    public double cosine(double angle) {
        throw new UnsupportedOperationException("Basic calculator not suppor trigonometric operations");
    }
}
