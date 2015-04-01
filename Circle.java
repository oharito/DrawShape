
public class Circle implements Shape {
    private double radius;
    private Point2d center;
    static String order = "Input via blank: \"Center's coordinate X0\" \"Y0\" \"Radius\"";
    
    Circle() {
	new Input(order);
	setShape();
	drawShape();
    }
    
    void setShape() {
	double x = Double.parseDouble(Input.getData(1));
	double y = Double.parseDouble(Input.getData(2));
	center = new Point2d(x, y);
	radius = Double.parseDouble(Input.getData(3));
    }
    
    Circle (double radius, Point2d center) { //Constructor for the class Test
	this.radius = radius;
	this.center = center;
	drawShape();
    }

    public void drawShape() { // it's only show the data on console
	System.out.println("Type of the Shape : 1 (Circle)");
	System.out.println("Shape's Center (x0 y0) " + center.getCenterX() + "  " + center.getCenterY());
	System.out.println("Radius " + radius);
	System.out.println();
    }

}
