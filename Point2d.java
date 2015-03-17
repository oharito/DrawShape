
public class Point2d {
    private double x0;
    private double y0;
    
    Point2d (double x, double y) { // constructor
	x0 = x;
	y0 = y;
    }

    public double getCenterX() {
	// System.out.println (x0);
	return x0;
    }

    public double getCenterY() {
	// System.out.println (y0);
	return y0;
    }
}
