import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Choice {
    static boolean isFile = false;
    static final int NUM_OF_SHAPE = 4;
    static String listOfShape [] = new String[NUM_OF_SHAPE+1];
    
    
    public static void inputDialog() throws FileNotFoundException {
	String list = "Input Type of Shape:\n"
    		+ "0 - Read from File\n"
    		+ "1 - Circle\n"
    		+ "2 - Equilateral polygon\n"
    		+ "3 - PolyLine\n"
    		+ "4 - Rhomb\n";
	int kind = Integer.parseInt(JOptionPane.showInputDialog(list));
	choice(kind);
    }
    
    public Choice() {
	listOfShape[0] = new String("Read from File");
	listOfShape[1] = new String("Circle");
	listOfShape[2] = new String("Equilateral polygon");
	listOfShape[3] = new String("PolyLine");
	listOfShape[4] = new String("Rhomb");

	ChoiceOfShape.doChoice();
    }
    
    public static Object choice (int k) throws FileNotFoundException {
	switch (k) {
//	case -1:
//	    return new Test();
	case 0:
	    isFile = true;
	    Scanner readFile = null;
	    try {
		readFile = new Scanner (new File("shape.txt"));
	    } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    int a = readFile.nextInt();
	    choice (a);
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
