import javax.swing.*;

public class Enter {

    private int kind = Integer
	    .parseInt(JOptionPane
		    .showInputDialog("Введите тип фигуры:\n1 - Окружность\n2 - Равносторонний многоугольник\n3 - Произвольная фигура"));

    public void choice() {
	switch (kind) {
	case 1:
	    Shape circle = new Circle();
	    circle.setData();
	    circle.drawShape();
	    break;

	case 2:
	    Shape equi = new Equi();
	    equi.setData();
	    equi.drawShape();
	    break;

	case 3:
	    Shape poly = new Poly();
	    poly.setData();
	    poly.drawShape();	    System.out.println();
	}
	System.out.println("Тип фигуры :  " + kind);
    }
}
