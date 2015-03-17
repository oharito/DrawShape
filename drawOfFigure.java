import javax.swing.JOptionPane;

public class drawOfFigure {
    public static void main(String[] args) {
	int kind;
	kind = Integer
		    .parseInt(JOptionPane
			    .showInputDialog("Input Type of Shape:\n 1 - Circle\n 2 - Equilateral polygon\n 3 - PolyLine"));
	System.out.println("Type of the Shape :  " + kind);
	Choice choice = new Choice();
	choice.choice(kind);
	
//	in.setKind();
//	in.choice();
	
    }
}
