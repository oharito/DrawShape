import javax.swing.JOptionPane;

public class Circle implements Shape {
    private double radius;
    private Point2d center;
    
    Circle() { //constructor
	double x = Double.parseDouble(JOptionPane.showInputDialog("Input Center's coordinate X:"));
	double y = Double.parseDouble(JOptionPane.showInputDialog("Input Center's coordinate Y:"));
	center = new Point2d(x, y);
	double r = Double.parseDouble(JOptionPane.showInputDialog("Input Radius:"));
	radius = r;
	drawShape();
    }
    
    Circle (double radius, Point2d center) { //Constructor for the class Test
	this.radius = radius;
	this.center = center;
	drawShape();
    }

    public void drawShape() { // it's only show the data on console
	System.out.println("Shape's Center (x0 y0) " + center.getCenterX() + "  " + center.getCenterY());
	System.out.println("Radius " + radius);
	System.out.println();
    }

}
