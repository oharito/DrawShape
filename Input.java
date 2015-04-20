import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
//import javax.swing.filechooser.FileNameExtensionFilter;


public class Input {
    private static String data;
    private static String file;
    private static String [] tokens;
    
    public static void input(String order) {
	if (!Choice.isFile) {inputDataFromWindow(order);}
    }
    
    public static void inputDataFromFile() {
	Scanner readFile = null;
	    try {
		JFileChooser chooser = new JFileChooser("E:\\");
//		FileNameExtensionFilter filter = new FileNameExtensionFilter(
//		        "*.txt", "jpg", "gif");
//		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(chooser);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
		   System.out.println("You chose to open this file: " +
		        chooser.getSelectedFile().getName());
		   file = chooser.getSelectedFile().getName();
		}
		readFile = new Scanner (new File("E:\\"+file));
	    } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    data = readFile.nextLine();
	    tokens = data.split(" ");
    }

    public static void inputDataFromWindow (String dialog) {
	data = "anySymbol " + JOptionPane.showInputDialog(dialog);
	tokens = data.split(" ");
    }
    
    public static String getData(int i) {
	return tokens [i];
    }
}
