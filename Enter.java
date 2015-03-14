import javax.swing.*;
import static java.lang.System.out;

public class Enter {

	private int kind = Integer
			.parseInt(JOptionPane
					.showInputDialog("Введите тип фигуры:\n1 - Окружность\n2 - Равносторонний многоугольник\n3 - Произвольная фигура"));

	public void dial() {
		switch (kind) {
		case 1:
			Circle circle = new Circle();
			// FrameCore center = new FrameCore();
			double x01 = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты X центра:"));
			double y01 = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты Y центра:"));
			double radius1 = Double.parseDouble(JOptionPane.showInputDialog("Введите радиус:"));
			circle.setCenter(x01, y01);
			circle.setRadius(radius1);
			circle.drawCircle();
			break;

		case 2:
			Equi equi = new Equi();
			double x02 = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты X центра фигуры:"));
			double y02 = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты Y центра фигуры:"));
			double radius2 = Double.parseDouble(JOptionPane.showInputDialog("Введите радиус описанной окружности:"));
			int side = Integer.parseInt(JOptionPane.showInputDialog("Введите количество сторон:"));
			equi.setCenter(x02, y02);
			equi.setRadius(radius2);
			equi.setSide(side);
			equi.drawEqui();
			break;

		case 3:
			Poly poly = new Poly();
			int v = Integer.parseInt(JOptionPane.showInputDialog("Введите количество вершин:"));
			poly.setVertex(v);

			// poly.points = new double[poly.vertex][2];

			int i = 0,
			j = 0;
			double z = 0;
			for (i = 0; i < poly.getVertex(); i++) {
				z = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты X" + i + " фигуры:"));
				poly.setPoint(i, j, z);
				j = 1;
				z = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты Y" + j + " фигуры:"));
				poly.setPoint(i, j, z);
				j = 0;
			}
			poly.drawPoly();
			out.println();
		}
		System.out.println("Тип фигуры :  " + kind);
	}
}
