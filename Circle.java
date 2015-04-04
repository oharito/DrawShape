
public class Circle extends Shape { 
    private double radius;
//    private Point2d center;
    static String order = "Input via blank: \"Center's coordinate X0\" \"Y0\" \"Radius\"";
    
    Circle() {
	new Input(order);
	setShape();
	drawShape();
    }
    
    public void setShape() {
	double x = Double.parseDouble(Input.getData(1));
	double y = Double.parseDouble(Input.getData(2));
	setPos(x, y);
//	pos = new Point2d(x, y);
	radius = Double.parseDouble(Input.getData(3));
    }
    
    public void setPos(double x, double y) {
	pos = new Point2d(x, y);
	
    }

    Circle (double radius, Point2d pos) { //Constructor for the class Test
	this.radius = radius;
	this.pos = pos;
	drawShape();
    }

    public void drawShape() { // it's only show the data on console
	System.out.println("Type of the Shape : 1 (Circle)");
	System.out.println("Shape's Center (x0 y0) " + pos.getCenterX() + "  " + pos.getCenterY());
	System.out.println("Radius " + radius);
	System.out.println();
    }

}
