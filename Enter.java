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
	    new Circle();
	    break;

	case 2:
	    new Equi();
	    break;

	case 3:
	    new Poly();
	}
	System.out.println("Type of the Shape :  " + kind);
    }
}
