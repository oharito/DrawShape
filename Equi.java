import javax.swing.JOptionPane;

public class Equi extends Shape { // class of Equilateral polygon

    private int sides;
    private double radius;
    Point2d center;
    
    public void setData() {
	    double x = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты X центра фигуры:"));
	    double y = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты Y центра фигуры:"));
	    center = new Point2d(x, y);
	    double r = Double.parseDouble(JOptionPane.showInputDialog("Введите радиус описанной окружности:"));
	    radius = r;
	    int s = Integer.parseInt(JOptionPane.showInputDialog("Введите количество сторон:"));
	    sides = s;
	    drawShape();
    }

    public void drawShape() { // it's only show the data on console
	System.out.println("Центр фигуры (x0 y0) " + center.getCenterX() + "  " + center.getCenterY());
	// out.println("Центр фигуры (x0 x0) " + x0 + "  " + y0);
	System.out.println("Радиус (radius) " + radius);
	System.out.println("Количество сторон (sides) " + sides);
    }

}
