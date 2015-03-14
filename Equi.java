import static java.lang.System.out;

public class Equi { // class of Equilateral polygon

	private int sides = 0;
	private double radius = 0;
	FrameCore center = new FrameCore();

	public void setRadius(double r) {
		radius = r;
	}

	public void setSide(int s) {
		sides = s;
	}

	public void setCenter(double x, double y) {
		center.setCenter(x, y); // Fan! I can't call this method directly from
								// class Enter (line 28)
	}

	public void drawEqui() {
		// will be a code to draw of equilateral polygon
	}

	public void showDataEqui() { // show data of equilateral polygon on Console
		out.println("Центр фигуры (x0 x0) " + center.getCenterX() + "  " + center.getCenterY());
		// out.println("Центр фигуры (x0 x0) " + x0 + "  " + y0);
		out.println("Радиус (radius) " + radius);
		out.println("Количество сторон (sides) " + sides);
	}
}
