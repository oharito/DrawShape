import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Rhomb implements Shape { // class of Rhomb
    private double width;
    private double height;
    Point2d center;
    private Scanner readFile;
    private PrintStream fileTemp;

    Rhomb() throws FileNotFoundException { // constructor
	inputAndSetCenter();
	// double x = Double.parseDouble(JOptionPane.showInputDialog("Input Center's coordinate X:"));
	// double y = Double.parseDouble(JOptionPane.showInputDialog("Input Center's coordinate Y:"));
	// center = new Point2d(x, y);
	width = Double.parseDouble(JOptionPane.showInputDialog("Input Rhomb's width:"));
	height = Double.parseDouble(JOptionPane.showInputDialog("Input Rhomb's height:"));
	drawShape();
    }

    void inputAndSetCenter() throws FileNotFoundException {
	// String s;
	String s = JOptionPane.showInputDialog("Input Center's coordinate X0 Y0:");
	fileTemp = new PrintStream("Temp");
	fileTemp.println(s);
	readFile = new Scanner(new File("Temp"));
	center = new Point2d(readFile.nextDouble(), readFile.nextDouble());
    }

    Rhomb(double width, double height, Point2d center) { // Constructor for the class Test
	this.width = width;
	this.height = height;
	this.center = center;
	drawShape();
    }

    public void drawShape() { // it's only show the data on console
	System.out.println("Type of the Shape : 4 (Rhomb)");
	System.out.println("Shape's Center (x0 y0) " + center.getCenterX() + "  " + center.getCenterY());
	System.out.println("Width " + width);
	System.out.println("Height " + height);
	System.out.println();
    }
}
