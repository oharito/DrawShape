
public class Equi extends Shape { // class of Equilateral polygon

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
		center.setCenter(x, y); 
	}
	
	@Override
	public void setData() {
	    // TODO Auto-generated method stub
	    
	}

	public void drawShape() { // it's only show the data on concole
	    System.out.println("Центр фигуры (x0 x0) " + center.getCenterX() + "  " + center.getCenterY());
		// out.println("Центр фигуры (x0 x0) " + x0 + "  " + y0);
	    System.out.println("Радиус (radius) " + radius);
	    System.out.println("Количество сторон (sides) " + sides);
	}

}
