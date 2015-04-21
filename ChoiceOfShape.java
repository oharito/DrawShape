import javax.swing.JOptionPane;

public class ChoiceOfShape {
    static boolean isFile = false;
    String list = "Input Type of Shape:\n" 
	    + "0 - Read from File\n" 
	    + "1 - Circle\n"
	    + "2 - Equilateral polygon\n" 
	    + "3 - PolyLine\n" 
	    + "4 - Rhomb\n";

    public static void main(String[] args) {
	new ChoiceOfShape().beginDialog();
    }
    
    public void beginDialog() {
	int kind = Integer.parseInt(JOptionPane.showInputDialog(this.list));
	choice(kind);
    }

    public Object choice(int k) {
	switch (k) {
	case 0:
	    isFile = true;
	    Input.inputDataFromFile();
	    int a = Integer.parseInt(Input.getData(0));
	    choice(a);
	    break;
	case 1:
	    return new Circle();
	case 2:
	    return new Equi();
	case 3:
	    return new Poly();
	case 4:
	    return new Rhomb();
	}
	return null;
    }
}
