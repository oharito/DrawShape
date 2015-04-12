import java.awt.Color;
import java.awt.Graphics;
//import java.awt.Graphics2D;


import javax.swing.JPanel;


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
	@SuppressWarnings("rawtypes")
	Draw draw = new Draw();
	DrawPanel panel = new DrawPanel();
	draw.addDrawPanel(panel);
	
	
    }
    @SuppressWarnings("serial")
    class DrawPanel extends JPanel {

	public void paintComponent(Graphics g) {
	    g.setColor(Color.gray);
	    g.fillRect(0, 0, this.getWidth(), this.getHeight());
//	    Graphics2D g2d = (Graphics2D) g;
	    g.setColor(Color.red);
	    int xCenter = (int) getPos().getCenterX();
	    int yCenter = (int) getPos().getCenterY();
	    int rad = (int) radius;
	    g.drawOval(xCenter - rad, yCenter - rad, rad*2, rad*2);

	}
    } // close inner class
}
