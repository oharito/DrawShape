import javax.swing.JOptionPane;

public class Rhomb extends Shape { // class of Rhomb
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
    
    public void drawShape() { // it's only show the data on console
	System.out.println("Shape's Center (x0 y0) " + center.getCenterX() + "  " + center.getCenterY());
	System.out.println("Width " + width);
	System.out.println("Height " + height);
    }
}
