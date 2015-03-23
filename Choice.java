public class Choice {
    public String list = "Input Type of Shape:\n"
    		+ "0 - Test\n"
    		+ "1 - Circle\n"
    		+ "2 - Equilateral polygon\n"
    		+ "3 - PolyLine\n"
    		+ "4 - Rhomb\n";
    
    public Object choice (int k) {
	switch (k) {
	case 0:
	    return new Test ();
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
