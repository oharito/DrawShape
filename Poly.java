import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Poly extends Shape { // class of PolyLine
    private int vertex;
    private ArrayList<Point2d> dot = new ArrayList<Point2d>();

    public void setData() {
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

    public void drawShape() { // it's only show the data on console
	for (int i = 0; i < vertex; i++) {
	    System.out.print("Point " + i + "  =  ");
	    System.out.println(dot.get(i).getCenterX() + "   " + dot.get(i).getCenterY());
	}
    }

}
