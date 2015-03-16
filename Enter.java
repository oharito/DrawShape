import javax.swing.*;
import static java.lang.System.out;

public class Enter {

    private int kind = Integer
	    .parseInt(JOptionPane
		    .showInputDialog("Введите тип фигуры:\n1 - Окружность\n2 - Равносторонний многоугольник\n3 - Произвольная фигура"));

    public void choice() {
	switch (kind) {
	case 1:
	    Circle circle = new Circle();
	    circle.setData();
	    circle.drawShape();
	    break;

	case 2:
	    Equi equi = new Equi();
	    equi.setData();
	    equi.drawShape();
	    break;

	case 3:
	    Poly poly = new Poly();
	    poly.setData();
	    poly.drawShape();
	    out.println();
	}
	System.out.println("Тип фигуры :  " + kind);
    }
}
