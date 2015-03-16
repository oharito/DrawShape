public class Circle extends Shape {
    private double radius = 0;
    Point2d center = new Point2d();

    public void setRadius(double r) {
	radius = r;
    }

    public void setCenter(double x, double y) {
	center.setCenter(x, y);
    }

    public void setData() {
	// TODO Auto-generated method stub

    }

    public void drawShape() { // it's only show the data on concole
	System.out.println("Центр фигуры (x0 x0) " + center.getCenterX() + "  " + center.getCenterY());
	System.out.println("Радиус (radius) " + radius);
    }

}
