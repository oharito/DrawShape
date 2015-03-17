import javax.swing.JOptionPane;

public class Poly extends Shape { // class of PolyLine
    private int vertex;
    private double[][] points;

    public void setData() {
	int v = Integer.parseInt(JOptionPane.showInputDialog("Введите количество вершин:"));
	vertex = v;
	points = new double[vertex][2];
	int j = 0;
	double z;
	for (int i = 0; i < vertex; i++) {
	    z = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты X" + i + " фигуры:"));
	    points[i][j] = z;
	    j = 1;
	    z = Double.parseDouble(JOptionPane.showInputDialog("Введите координаты Y" + j + " фигуры:"));
	    points[i][j] = z;
	    j = 0;
	}
    }

    public void drawShape() { // it's only show the data on console
	for (int x = 0; x < vertex; x++) {
	    System.out.print("Точка " + x + " = ");
	    for (int y = 0; y < 2; y++) {
		System.out.print(points[x][y] + "  ");
	    }
	    System.out.println();
	}
    }

}
