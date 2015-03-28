import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Choice {
    static boolean isFile = false;
    static String list = "Input Type of Shape:\n"
    		+ "0 - Read from File\n"
    		+ "1 - Circle\n"
    		+ "2 - Equilateral polygon\n"
    		+ "3 - PolyLine\n"
    		+ "4 - Rhomb\n";
    
    public Object choice (int k) {
	switch (k) {
	case 0:
//	    return new Test ();
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
