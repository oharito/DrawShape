import javax.swing.JOptionPane;

public class Circle extends Shape {
    private double radius;
    private Point2d center;
    
//   Circle (double x, double y, double r) { //constructor
//	center = new Point2d (x,y);
//	radius =r;
//  }

    // public void setCenter(double x, double y) {
    // center.setCenter(x, y);
    // }

    public void setData() {
	double x = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты X центра:"));
	double y = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты Y центра:"));
	center = new Point2d(x, y);
	double r = Double.parseDouble(JOptionPane.showInputDialog("Введите радиус:"));
	radius = r;
	drawShape();
    }

    public void drawShape() { // it's only show the data on console
	System.out.println("Центр фигуры (x0 y0) " + center.getCenterX() + "  " + center.getCenterY());
	System.out.println("Радиус (radius) " + radius);
    }

}
