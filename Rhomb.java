
public class Rhomb implements Shape { // class of Rhomb
    private double width;
    private double height;
    Point2d center;
    static String order = "Input via blank: \"Center's coordinate X0\" \"Y0\" \"Rhomb's Width\" \"Height:\"";

    Rhomb() { // constructor
	new Input(order);
	setShape();
	drawShape();
    }
    
    void setShape() {
	double x = Double.parseDouble(Input.getData(1));
	double y = Double.parseDouble(Input.getData(2));
	center = new Point2d(x, y);
	width = Double.parseDouble(Input.getData(3));
	height = Double.parseDouble(Input.getData(4));
    }
    
    Rhomb(double width, double height, Point2d center) { // Constructor for the class Test
	this.width = width;
	this.height = height;
	this.center = center;
	drawShape();
    }

    public void drawShape() { // it's only show the data on console
	System.out.println("Type of the Shape : 4 (Rhomb)");
	System.out.println("Shape's Center (x0 y0) " + center.getCenterX() + "  " + center.getCenterY());
	System.out.println("Width " + width);
	System.out.println("Height " + height);
	System.out.println();
    }
}
