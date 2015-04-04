
public class Equi extends Shape { // class of Equilateral polygon

    private int sides;
    private double radius;
//    private Point2d center;
    static String order = "Input via blank: \"Center's coordinate X0\" \"Y0\" \"Radius\" \"Number of Sides\"";
    
    Equi() {
	doShape(order);
    }
    
    public void setShape() {
	double x = Double.parseDouble(Input.getData(1));
	double y = Double.parseDouble(Input.getData(2));
	setPos(new Point2d(x, y));
	radius = Double.parseDouble(Input.getData(3));
	sides = Integer.parseInt(Input.getData(4));
    }
    
    Equi (int sides, double radius, Point2d pos) { //Constructor for the class Test
	this.sides = sides;
	this.radius = radius;
	this.setPos(pos);
	drawShape();
    }

    public void drawShape() { // it's only show the data on console
	System.out.println("Type of the Shape : 2 (Equilateral polygon)");
	System.out.println("Shape's Center (x0 y0) " + getPos().getCenterX() + "  " + getPos().getCenterY());
	System.out.println("Radius " + radius);
	System.out.println("Sides's Number " + sides);
	System.out.println();
    }

}
