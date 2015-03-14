
public class Circle {

	private double radius = 0;
	FrameCore center = new FrameCore();

	public void setRadius(double r) {
		radius = r;
	}

	public void setCenter(double x, double y) {
		center.setCenter(x, y); // Fan! I can't call this method directly from
								// class Enter (line 17)
	}

	public void drawCircle() { // it's only show the data on concole
		System.out.println("Центр фигуры (x0 x0) " + center.getCenterX() + "  " + center.getCenterY());
		System.out.println("Радиус (radius) " + radius);
	}

}
