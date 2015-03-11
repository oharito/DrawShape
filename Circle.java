import static java.lang.System.out;

public class Circle { // class of Circle

    private double radius = 0;
    FrameCore center = new FrameCore ();

    public void setRadius(double r) {
	radius = r;
    }
    
    public void setCenter (double x, double y) {
	center.setCenter(x, y);
    }

    public void drawCircle() { 
	// will be a code to draw of Circle
    }

    public void showDataCircle() { // show data of Circle on Console
	out.println("Центр фигуры (x0 x0) " + center.getCenterX() + "  " + center.getCenterY());
	out.println("Радиус (radius) " + radius);
    }
}
