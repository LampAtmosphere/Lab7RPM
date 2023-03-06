
public class Calculator {

       public double pervoe(double x) {
           return 3 * x + 5;
       }
       
       public double vtoroe(double a, double b) {
           return (a + b)/(a - b);
       }
       
       public double tretie(double a, double x, double b) {
           double ax = Math.pow(a*x/b, a*x/b);
           return ax;
       }
   }