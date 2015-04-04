
public class Circle extends Shape { 
    private double radius;
//    private Point2d center;
    static String order = "Input via blank: \"Center's coordinate X0\" \"Y0\" \"Radius\"";
    
    Circle() {
	doShape(order);
    }
    
    public void setShape() {
	double x = Double.parseDouble(Input.getData(1));
	double y = Double.parseDouble(Input.getData(2));
	setPos(new Point2d(x, y));
	radius = Double.parseDouble(Input.getData(3));
    }
    

    Circle (double radius, Point2d pos) { //Constructor for the class Test
	this.radius = radius;
	this.setPos(pos);
	drawShape();
    }

    public void drawShape() { // it's only show the data on console
	System.out.println("Type of the Shape : 1 (Circle)");
	System.out.println("Shape's Center (x0 y0) " + getPos().getCenterX() + "  " + getPos().getCenterY());
	System.out.println("Radius " + radius);
	System.out.println();
    }

}
