import static java.lang.System.out;

// import javax.swing.*;
// import static java.lang.System.out;

class Figure {
//	int kind;
	int side = 0, vertex = 0;
	double x0 = 0, y0 = 0, radius = 0;
//	double[][] points;
	// Метод класса Figure
	void ShowData () {
	    out.println("Центр фигуры (x0 x0) " + x0 + "  " + y0);
	    out.println("Радиус (radius) " + radius);
	    out.println("Количество сторон (side) " + side);
	    out.println("Количество вершин (vertex) " + vertex);
	}
}
