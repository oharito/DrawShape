public class Choice {
    
    Shape choice(int k) {
	
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
