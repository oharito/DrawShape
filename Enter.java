import javax.swing.*;

public class Enter {

    private int kind;
    
    public void setKind () {
	kind = Integer
		    .parseInt(JOptionPane
			    .showInputDialog("Input Type of Shape:\n 1 - Circle\n 2 - Equilateral polygon\n 3 - PolyLine"));
    }
    

    public void choice() {
	switch (kind) {
	case 1:
	    Shape circle = new Circle();
	    circle.setData();
//	    circle.drawShape();
	    break;

	case 2:
	    Shape equi = new Equi();
	    equi.setData();
//	    equi.drawShape();
	    break;

	case 3:
	    Shape poly = new Poly();
	    poly.setData();
//	    poly.drawShape();	}
	System.out.println("Type of the Shape :  " + kind);
    }
}
