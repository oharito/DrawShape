import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Input {
    private static String data;
    private static String [] tokens;
    
    Input(String order) {
	if (Choice.isFile) {inputDataFromFile();}
	else {inputDataFromWindow(order);}
	tokens = data.split(" ");
    }
    
    private static void inputDataFromFile() {
	Scanner readFile = null;
	    try {
		readFile = new Scanner (new File("shape.txt"));
	    } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    data = readFile.nextLine();
    }

    private static void inputDataFromWindow (String dialog) {
	data = "anySymbol " + JOptionPane.showInputDialog(dialog);
    }
    
    public static String getData(int i) {
	return tokens [i];
    }
}
