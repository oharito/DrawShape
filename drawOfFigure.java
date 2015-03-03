import javax.swing.*;
import static java.lang.System.out;

public class drawOfFigure {
    public static void main(String[] args) {
	int kind;
//	int side = 0, vertex = 0;
//	double x0 = 0, y0 = 0, radius = 0;
	double[][] points;
//	Figure Fig = new Figure();
	

	kind = Integer
		.parseInt(JOptionPane
			.showInputDialog("Введите тип фигуры:\n1 - Окружность\n2 - Равносторонний многоугольник\n3 - Произвольная фигура"));
	
	switch (kind) {
	case 1:
	    Figure Fig1 = new Figure();
	    Fig1.x0 = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты X центра:"));
	    Fig1.y0 = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты Y центра:"));
	    Fig1.radius = Double.parseDouble(JOptionPane.showInputDialog("Введите радиус:"));
	    Fig1.ShowData ();
	    break;

	case 2:
	    Figure Fig2 = new Figure();
	    Fig2.x0 = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты X центра фигуры:"));
	    Fig2.y0 = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты Y центра фигуры:"));
	    Fig2.radius = Double.parseDouble(JOptionPane.showInputDialog("Введите радиус описанной окружности:"));
	    Fig2.side = Integer.parseInt(JOptionPane.showInputDialog("Введите количество сторон:"));
	    Fig2.ShowData ();
	    break;

	case 3:
	    Figure Fig3 = new Figure();
	    Fig3.vertex = Integer.parseInt(JOptionPane.showInputDialog("Введите количество вершин:"));
//	    int vertex = Fig3.vertex;
	    points = new double[Fig3.vertex][2];
	    int x = 0,
	    y = 0;
	    for (x = 0; x < Fig3.vertex; x++) {
		points[x][y] = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты X" + x + " фигуры:"));
		// out.print(points [x][y] + "  ");
		y = 1;
		points[x][y] = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты Y" + x + " фигуры:"));
		// out.println(points [x][y]);
		y = 0;
	    }
	    Fig3.ShowData ();
	    out.println();

	    // Проверка введенных значений на консоле
	    for (x = 0; x < Fig3.vertex; x++) {
		out.print("Точка " + x + " = ");
		for (y = 0; y <= 1; y++) {
		    out.print(points[x][y] + "  ");
		}
		out.println();
	    }
	    out.println();
	}
	out.println("Тип фигуры (kind) " + kind);
//	out.println("Центр фигуры (x0 x0) " + Fig.x0 + "  " + Fig.y0);
//	out.println("Радиус (radius) " + Fig.radius);
//	out.println("Количество сторон (side) " + Fig.side);
//	out.println("Количество вершин (vertex) " + Fig.vertex);
    }
}
