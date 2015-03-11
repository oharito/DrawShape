import static java.lang.System.out;

// import javax.swing.*;

public class Poly { // class of Poly Line
    int vertex;
    double[][] points = new double[vertex][2];

    public void drawPoly() { // draw of Poly Line
	// will be a code to draw of Poly Line
    }

    public void showDataPoly() { // show data of Poly Line on Console
	for (int x = 0; x < vertex; x++) {
		out.print("Точка " + x + " = ");
		for (int y = 0; y < 2; y++) {
		    out.print(points[x][y] + "  ");
		}
		out.println();
	    }
    }
}
