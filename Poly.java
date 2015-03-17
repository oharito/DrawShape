import javax.swing.JOptionPane;

public class Poly extends Shape { // class of PolyLine
    private int vertex;
    Point2d [] dot;

    public void setData() {
	int v = Integer.parseInt(JOptionPane.showInputDialog("Введите количество вершин:"));
	vertex = v;
	dot = new Point2d [vertex];
	double x;
	double y;
	for (int i = 0; i < vertex; i++) {
	    x = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты X" + i + " фигуры:"));
	    y = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты Y" + i + " фигуры:"));
	    dot [i] = new Point2d (x,y);
	}
	drawShape();
    }

    public void drawShape() { // it's only show the data on console
	for (int i = 0; i < vertex; i++) {
	    System.out.print("Точка " + i + "  =  ");
	    System.out.println (dot[i].getCenterX() + "   " + dot[i].getCenterY());
	    }
    }

}
