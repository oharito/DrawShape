import java.util.ArrayList;

public class Poly extends Shape { // class of PolyLine
    private int vertex;
    private ArrayList<Point2d> dot = new ArrayList<Point2d>();
    static String order = "Input via blank: \"Vertex's number\" \"Shape's points X\" \"Shape's points Y\"";
    
    Poly() {
	Input.input(order);
	setShape();
	drawShape();
    }
    
    public void setShape() {
	vertex = Integer.parseInt(Input.getData(1));
	double x;
	double y;
	for (int i = 2; i <= vertex*2; i = i + 2) {
	    x = Double.parseDouble(Input.getData(i));
	    y = Double.parseDouble(Input.getData(i+1));
	    dot.add(new Point2d(x, y));
	}
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
