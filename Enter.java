import javax.swing.*;
import static java.lang.System.out;

public class Enter {

	private int kind = Integer
		.parseInt(JOptionPane
			.showInputDialog("Введите тип фигуры:\n1 - Окружность\n2 - Равносторонний многоугольник\n3 - Произвольная фигура"));
	public void dial () {
	switch (kind) {
	case 1:
	    Circle circle = new Circle ();
//	    FrameCore center = new FrameCore();
	    double x01 = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты X центра:"));
	    double y01 = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты Y центра:"));
	    double radius = Double.parseDouble(JOptionPane.showInputDialog("Введите радиус:"));
	    circle.setCenter (x01,y01);
	    circle.setRadius (radius);
	    circle.showDataCircle ();
	    break;

	case 2:
	    Equi equi = new Equi();
	    double x02 = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты X центра фигуры:"));
	    double y02 = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты Y центра фигуры:"));
	    double radius1 = Double.parseDouble(JOptionPane.showInputDialog("Введите радиус описанной окружности:"));
	    int side = Integer.parseInt(JOptionPane.showInputDialog("Введите количество сторон:"));
	    equi.setEqui (x02, y02, radius1, side);
	    equi.showDataEqui ();
	    break;

	case 3:
	    Poly poly = new Poly ();
	    poly.vertex = Integer.parseInt(JOptionPane.showInputDialog("Введите количество вершин:"));
	    poly.points = new double[poly.vertex][2];
	    int x = 0,
	    y = 0;
	    for (x = 0; x < poly.vertex; x++) {
		poly.points[x][y] = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты X" + x + " фигуры:"));
		y = 1;
		poly.points[x][y] = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты Y" + x + " фигуры:"));
		y = 0;
	    }
	    poly.showDataPoly ();
	    out.println();
	   
	}
	out.println ("Тип фигуры :  "+kind);
	}
}

