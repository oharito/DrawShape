import javax.swing.JOptionPane;

public class Equi extends Shape { // class of Equilateral polygon

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

    public void drawShape() { // it's only show the data on console
	System.out.println("Shape's Center (x0 y0) " + center.getCenterX() + "  " + center.getCenterY());
	// out.println("Центр фигуры (x0 x0) " + x0 + "  " + y0);
	System.out.println("Radius " + radius);
	System.out.println("Sides's Number " + sides);
    }

}
