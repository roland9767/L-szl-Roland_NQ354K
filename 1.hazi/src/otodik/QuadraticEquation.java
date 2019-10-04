package otodik;

public class QuadraticEquation {
    
    private double a, b, c;

    public QuadraticEquation(double a1, double b1, double c1) {
        this.a = a1;
        this.b = b1;
        this.c = c1;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return this.b * this.b -(4 * this.a * this.c);
    }

    public double getRoot1() {
        if(this.getDiscriminant() < 0)
            return 0;
        else
            return (-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }

    public double getRoot2() {
        if(this.getDiscriminant() < 0)
            return 0;
        else
            return (-this.b - Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
    
}
