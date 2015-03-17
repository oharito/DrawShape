public class Choice {
    	public String list = "Input Type of Shape:\n"
    		+ " 1 - Circle\n "
    		+ "2 - Equilateral polygon\n "
    		+ "3 - PolyLine";
    
    public Shape choice (int k) {
	switch (k) {
	case 1:
	    return new Circle();
	case 2:
	    return new Equi();
	case 3:
	    return new Poly();
	}
	return null;
    }
}
