
public class FrameCore {
    private double x0, y0;
    
    void setCenter (double x, double y) {
	x0=x;
	y0=y;
    }
    
    double getCenterX () {
//	System.out.println (x0);
	return x0;
    }
    
    double getCenterY () {
//	System.out.println (y0);
	return y0;
    }

}
