import javax.swing.*;
import static java.lang.System.out;

public class drawOfFigure {
    public static void main(String[] args) {
	int kind, side = 0, vertex = 0;
	double x0 = 0, y0 = 0, radius = 0;
	double[][] points;

	kind = Integer
		.parseInt(JOptionPane
			.showInputDialog("Введите тип фигуры:\n1 - Окружность\n2 - Равносторонний многоугольник\n3 - Произвольная фигура"));

	switch (kind) {
	case 1:
	    x0 = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты X центра:"));
	    y0 = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты Y центра:"));
	    radius = Double.parseDouble(JOptionPane.showInputDialog("Введите радиус:"));
	    break;

	case 2:
	    x0 = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты X центра фигуры:"));
	    y0 = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты Y центра фигуры:"));
	    radius = Double.parseDouble(JOptionPane.showInputDialog("Введите радиус описанной окружности:"));
	    side = Integer.parseInt(JOptionPane.showInputDialog("Введите количество сторон:"));
	    break;

	case 3:
	    vertex = Integer.parseInt(JOptionPane.showInputDialog("Введите количество вершин:"));
	    points = new double[vertex][2];
	    int x = 0,
	    y = 0;
	    for (x = 0; x < vertex; x++) {
		points[x][y] = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты X" + x + " фигуры:"));
		// out.print(points [x][y] + "  ");
		y = 1;
		points[x][y] = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты Y" + x + " фигуры:"));
		// out.println(points [x][y]);
		y = 0;
	    }
	    out.println();

	    // Проверка введенных значений на консоле
	    for (x = 0; x < vertex; x++) {
		out.print("Точка " + x + " = ");
		for (y = 0; y <= 1; y++) {
		    out.print(points[x][y] + "  ");
		}
		out.println();
	    }
	    out.println();
	}
	out.println("Тип фигуры (kind) " + kind);
	out.println("Центр фигуры (x0 x0) " + x0 + "  " + y0);
	out.println("Радиус (radius) " + radius);
	out.println("Количество сторон (side) " + side);
	out.println("Количество вершин (vertex) " + vertex);
    }
}
