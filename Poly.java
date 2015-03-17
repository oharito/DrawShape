import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Poly extends Shape { // class of PolyLine
    private int vertex;
    private ArrayList <Point2d> dot = new ArrayList <Point2d>();

    public void setData() {
	int v = Integer.parseInt(JOptionPane.showInputDialog("Введите количество вершин:"));
	vertex = v;
	double x;
	double y;
	for (int i = 0; i < vertex; i++) {
	    x = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты X" + i + " фигуры:"));
	    y = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты Y" + i + " фигуры:"));
	    dot.add(new Point2d (x,y));
	}
	drawShape();
    }

    public void drawShape() { // it's only show the data on console
	for (int i = 0; i < vertex; i++) {
	    System.out.print("Точка " + i + "  =  ");
	    System.out.println (dot.get(i).getCenterX() + "   " + dot.get(i).getCenterY());
	    }
    }

}
