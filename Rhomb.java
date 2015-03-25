import javax.swing.JOptionPane;

public class Rhomb implements Shape { // class of Rhomb
    private double width;
    private double height;
    Point2d center;
    
    Rhomb() { //constructor
	    double x = Double.parseDouble(JOptionPane.showInputDialog("Input Center's coordinate X:"));
	    double y = Double.parseDouble(JOptionPane.showInputDialog("Input Center's coordinate Y:"));
	    center = new Point2d(x, y);
	    double w = Double.parseDouble(JOptionPane.showInputDialog("Input Rhomb's width:"));
	    width = w;
	    double h = Integer.parseInt(JOptionPane.showInputDialog("Input Rhomb's height:"));
	    height = h;
	    drawShape();
    }
    
    Rhomb (double width, double height, Point2d center) { //Constructor for the class Test
	this.width = width;
	this.height = height;
	this.center =center;
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
