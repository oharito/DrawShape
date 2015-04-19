import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class drawOfFigure {
    public static void main(String[] args) throws FileNotFoundException {
	int kind;
	kind = Integer.parseInt(JOptionPane.showInputDialog(Choice.list));
	Choice.choice(kind);
    }
}
