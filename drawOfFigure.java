import javax.swing.*;
import static java.lang.System.out;

public class drawOfFigure {
	public static void main(String[] args) {
		int kind, side = 0, vertex = 0;
		double x0 = 0, y0 = 0, radius = 0;
		double[][] points;

		kind = Integer
				.parseInt(JOptionPane
						.showInputDialog("������� ��� ������:\n1 - ����������\n2 - �������������� �������������\n3 - ������������ ������"));

		switch (kind) {
		case 1:
			x0 = Double.parseDouble(JOptionPane.showInputDialog("������� ���������� X ������:"));
			y0 = Double.parseDouble(JOptionPane.showInputDialog("������� ���������� Y ������:"));
			radius = Double.parseDouble(JOptionPane.showInputDialog("������� ������:"));
			break;

		case 2:
			x0 = Double.parseDouble(JOptionPane.showInputDialog("������� ���������� X ������ ������:"));
			y0 = Double.parseDouble(JOptionPane.showInputDialog("������� ���������� Y ������ ������:"));
			radius = Double.parseDouble(JOptionPane.showInputDialog("������� ������ ��������� ����������:"));
			side = Integer.parseInt(JOptionPane.showInputDialog("������� ���������� ������:"));
			break;

		case 3:
			vertex = Integer.parseInt(JOptionPane.showInputDialog("������� ���������� ������:"));
			points = new double [vertex][2];
			int x=0, y=0;
			for (x = 0; x < vertex; x++) {
				points[x][y] = Double.parseDouble(JOptionPane.showInputDialog("������� ���������� X" +x+ " ������:"));
//				out.print(points [x][y] + "  ");
				y = 1;
				points[x][y] = Double.parseDouble(JOptionPane.showInputDialog("������� ���������� Y" +x+ " ������:"));
//				out.println(points [x][y]);
				y=0;
			}
			out.println();
			
			
// �������� ��������� �������� �� �������			
			for (x=0; x<vertex; x++) {
				out.print("����� "+x+" = ");
				for (y=0; y<=1; y++) {
					out.print(points [x][y]+"  ");
				}
				out.println();
			}
			out.println();
		}
		out.println("��� ������ (kind) "+kind);
		out.println("����� ������ (x0 x0) "+x0+"  "+y0);
		out.println("������ (radius) "+radius);
		out.println("���������� ������ (side) "+side);
		out.println("���������� ������ (vertex) "+vertex);
	}
}


