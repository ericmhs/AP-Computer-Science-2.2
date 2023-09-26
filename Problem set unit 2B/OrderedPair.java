
/**
 * Write a description of class OrderedPair here.
 *
 * Eric Shen
 * Sep 21
 */
public class OrderedPair{

    double X;
    double Y;

    public OrderedPair() {
        X = 0.0;
        Y = 0.0;
    }

    public OrderedPair(double x, double y) {
        X = x;
        Y = y;
    }

    public String toString() {
        return "(" + X + "," + Y + ")";
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }
}

