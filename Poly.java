import javax.swing.JOptionPane;

import java.util.ArrayList;

public class Poly implements Shape { // class of PolyLine
    private int vertex;
    private ArrayList<Point2d> dot = new ArrayList<Point2d>();

    Poly() { //constructor
	int v = Integer.parseInt(JOptionPane.showInputDialog("Input Vertex's number:"));
	vertex = v;
	double x;
	double y;
	for (int i = 0; i < vertex; i++) {
	    x = Double.parseDouble(JOptionPane.showInputDialog("Input Shape's point X" + i + ":"));
	    y = Double.parseDouble(JOptionPane.showInputDialog("Input Shape's point Y" + i + ":"));
	    dot.add(new Point2d(x, y));
	}
	drawShape();
    }
    
    Poly (int vertex, Point2d a, Point2d b, Point2d c, Point2d d) { //Constructor for the class Test
	this.vertex = vertex;
	dot.add(a);
	dot.add(b);
	dot.add(c);
	dot.add(d);
	drawShape();
    }

    public void drawShape() { // it's only show the data on console
	System.out.println("Type of the Shape : 3 (PolyLine)");
	System.out.println("Vertex " + vertex);
	for (int i = 0; i < vertex; i++) {
	    System.out.print("Point " + i + "  =  ");
	    System.out.println(dot.get(i).getCenterX() + "   " + dot.get(i).getCenterY());
	}
	System.out.println();
    }

}
