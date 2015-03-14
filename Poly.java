import static java.lang.System.out;


public class Poly { // class of Poly Line
    private int vertex;
    private double[][] points;
    
    public void setVertex (int v) {
	vertex = v;
	points = new double[vertex][2];
    }
    
    public int getVertex () {
	return vertex;
    }
    
    public void setPoint (int i, int j, double z) {
	points [i][j] = z;
    }

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
