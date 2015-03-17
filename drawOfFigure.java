import javax.swing.JOptionPane;

public class drawOfFigure {
    public static void main(String[] args) {
	int kind;
	Choice choice = new Choice();
	kind = Integer.parseInt(JOptionPane.showInputDialog(choice.list));
	System.out.println("Type of the Shape :  " + kind);
//	Choice choice = new Choice();
	choice.choice(kind);
    }
}
