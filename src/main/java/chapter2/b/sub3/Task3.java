package chapter2.b.sub3;

import org.apache.commons.math3.complex.Complex;

public class Task3 {

    public static RootPair findRoots(final double a,final double b,final double c) {
        return findRoots(new Complex(a), new Complex(b), new Complex(c));
    }

    public static RootPair findRoots(final Complex a,final Complex b,final Complex c) {
        Complex b2c =  b.multiply(b);
        Complex ac4m = a.multiply(c).multiply(4).negate();
        final Complex discriminant = b2c.add(ac4m);
        Complex x1 = calculateFirst(a, b, discriminant);
        Complex x2 = calculateSecond(a, b, discriminant);
        return new RootPair(x1, x2);
    }

    static private Complex calculateFirst(Complex a, Complex b, Complex discriminant) {
        return calculate(a, b, discriminant, true);
    }

    static private Complex calculateSecond(Complex a, Complex b, Complex discriminant) {
        return calculate(a, b, discriminant, false);
    }

    static private Complex calculate(Complex a, Complex b, Complex discriminant, boolean first) {
        Complex bc = b.negate().divide(a.multiply(2));
        bc = bc.getImaginary() == -0.0 ? new Complex(bc.getReal(), 0) : bc;
        return bc.add(calculateDiscriminantComponent(discriminant, first));
    }

    static private Complex calculateDiscriminantComponent(Complex var1, final boolean var2) {
        final Complex var4 = var1.sqrt().divide(2);
        return var2 ? var4 : var4.negate();
    }

    static class RootPair {
        private Complex x1;
        private Complex x2;

        public RootPair(Complex x1, Complex x2) {
            this.x1 = x1;
            this.x2 = x2;
        }

        public Complex getX1() {
            return x1;
        }

        public Complex getX2() {
            return x2;
        }
    }
}
