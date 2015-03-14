
public class Poly extends Shape { // class of Poly Line
    private int vertex;
    private double[][] points;

    public void setVertex(int v) {
	vertex = v;
	points = new double[vertex][2];
    }

    public int getVertex() {
	return vertex;
    }

    public void setPoint(int i, int j, double z) {
	points[i][j] = z;
    }
    
    public void setData() {
	// TODO Auto-generated method stub
	
    }

    public void drawShape() { // it's only show the data on concole
	for (int x = 0; x < vertex; x++) {
	    System.out.print("Точка " + x + " = ");
	    for (int y = 0; y < 2; y++) {
		System.out.print(points[x][y] + "  ");
	    }
	    System.out.println();
	}
    }



}
