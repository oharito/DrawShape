
public class Rhomb extends Shape { // class of Rhomb
    private double width;
    private double height;
//    private Point2d center;
    static String order = "Input via blank: \"Center's coordinate X0\" \"Y0\" \"Rhomb's Width\" \"Height:\"";

    Rhomb() { // constructor
	doShape(order);
    }
    
    public void setShape() {
	double x = Double.parseDouble(Input.getData(1));
	double y = Double.parseDouble(Input.getData(2));
	setPos(new Point2d(x, y));
	width = Double.parseDouble(Input.getData(3));
	height = Double.parseDouble(Input.getData(4));
    }
    
    Rhomb(double width, double height, Point2d pos) { // Constructor for the class Test
	this.width = width;
	this.height = height;
	this.setPos(pos);
	drawShape();
    }

    public void drawShape() { // it's only show the data on console
	System.out.println("Type of the Shape : 4 (Rhomb)");
	System.out.println("Shape's Center (x0 y0) " + getPos().getCenterX() + "  " + getPos().getCenterY());
	System.out.println("Width " + width);
	System.out.println("Height " + height);
	System.out.println();
    }
}
