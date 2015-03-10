import static java.lang.System.out;


public class Equi { // class of Equilateral polygon

    private int sides = 0;
    private double x0 = 0, y0 = 0, radius = 0;

    public void setEqui(double x, double y, double r, int s) { // setter
	x0 = x;
	y0 = y;
	radius = r;
	sides = s;
    }

    public void drawEqui() { 
	// will be a code to draw of equilateral polygon 
	}
    
    public void showDataEqui() { // show data of equilateral polygon on Console
	out.println("Центр фигуры (x0 x0) " + x0 + "  " + y0);
	out.println("Радиус (radius) " + radius);
	out.println("Количество сторон (sides) " + sides);
    }
}
