import javax.swing.JOptionPane;

public class Equi implements Shape { // class of Equilateral polygon

    private int sides;
    private double radius;
    Point2d center;
    
    Equi() { //constructor
	    double x = Double.parseDouble(JOptionPane.showInputDialog("Input Center's coordinate X:"));
	    double y = Double.parseDouble(JOptionPane.showInputDialog("Input Center's coordinate Y:"));
	    center = new Point2d(x, y);
	    double r = Double.parseDouble(JOptionPane.showInputDialog("Input Circumscribed circle's Radius:"));
	    radius = r;
	    int s = Integer.parseInt(JOptionPane.showInputDialog("Input Sides's Number:"));
	    sides = s;
	    drawShape();
    }
    
    Equi (int sides, double radius, Point2d center) { //Constructor for the class Test
	this.sides = sides;
	this.radius = radius;
	this.center = center;
	drawShape();
    }

    public void drawShape() { // it's only show the data on console
	System.out.println("Type of the Shape : 2 (Equilateral polygon)");
	System.out.println("Shape's Center (x0 y0) " + center.getCenterX() + "  " + center.getCenterY());
	System.out.println("Radius " + radius);
	System.out.println("Sides's Number " + sides);
	System.out.println();
    }

}
