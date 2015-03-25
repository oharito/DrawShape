import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Circle implements Shape {
    private double radius;
    private Point2d center;
    boolean isFile = false;
    
    Circle(boolean isFile) { 
	this.isFile = isFile;
	if (isFile) {
	    Scanner readFile = null;
	    try {
		readFile = new Scanner (new File("shape.txt"));
	    } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    readFile.nextInt();
	    double x = readFile.nextDouble();
	    double y = readFile.nextDouble();
	    double r = readFile.nextDouble();
	    center = new Point2d(x, y);
	    radius = r;
	} else {
	double x = Double.parseDouble(JOptionPane.showInputDialog("Input Center's coordinate X:"));
	double y = Double.parseDouble(JOptionPane.showInputDialog("Input Center's coordinate Y:"));
	center = new Point2d(x, y);
	double r = Double.parseDouble(JOptionPane.showInputDialog("Input Radius:"));
	radius = r;
	}
	drawShape();
    }
    
    Circle (double radius, Point2d center) { //Constructor for the class Test
	this.radius = radius;
	this.center = center;
	drawShape();
    }

    public void drawShape() { // it's only show the data on console
	System.out.println("Shape's Center (x0 y0) " + center.getCenterX() + "  " + center.getCenterY());
	System.out.println("Radius " + radius);
	System.out.println();
    }

}
