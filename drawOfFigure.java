import javax.swing.JOptionPane;

public class drawOfFigure {
    public static void main(String[] args) {
	int kind;
	Choice choice = new Choice();
	kind = Integer.parseInt(JOptionPane.showInputDialog(choice.list));
	choice.choice(kind);
    }
}
