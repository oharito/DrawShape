
import javax.swing.JOptionPane;

public class Rhomb implements Shape { // class of Rhomb
    private double width;
    private double height;
    Point2d center;
    private String data;
    private String [] tokens;

    Rhomb() { // constructor
	inputData();
	setData();
	drawShape();
    }
    
    void inputData () {
	data = JOptionPane.showInputDialog("Input via blank: \"Center's coordinate X0\" \"Y0\" \"Rhomb's Width\" \"Height:\"");
	tokens = data.split(" ");
    }
    
    void setData () {
	double x = Double.parseDouble(tokens[0]);
	double y = Double.parseDouble(tokens[1]);
	center = new Point2d(x, y);
	width = Double.parseDouble(tokens[2]);
	height = Double.parseDouble(tokens[3]);
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
