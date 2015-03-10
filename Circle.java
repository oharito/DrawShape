import static java.lang.System.out;



public class Circle { // class of Circle

    private double x0 = 0, y0 = 0, radius = 0;

    public void setCircle(double x, double y, double r) { // setter
	x0 = x;
	y0 = y;
	radius = r;
    }

    public void drawCircle() { 
	// will be a code to draw of Circle
    }

    public void showDataCircle() { // show data of Circle on Console
	out.println("Центр фигуры (x0 x0) " + x0 + "  " + y0);
	out.println("Радиус (radius) " + radius);
    }
}
