
public class Calculator {

    public double pervoe(double x) {
        return 3 * x + 5;
    }

    public double vtoroe(double a, double b) {
        if ((a-b) < 0) return 0;
        return (a + b)/(a - b);
    }

    public double tretie(double a, double x, double b) {
        if ((a-b) < 0) return 0;
        double ax = Math.pow(a*x/b, a*x/b);
        return ax;
    }
}