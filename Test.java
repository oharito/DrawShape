
public class Test {
    Point2d pos = new Point2d (1.2, 3.4);
    Circle circle = new Circle (5.5, pos);
    Equi equi = new Equi (6, 6.6, pos);
    Rhomb rhomb = new Rhomb (7.7, 7.77, pos);
    Point2d pos0 = new Point2d (1.1, 2.2);
    Point2d pos1 = new Point2d (3.3, 4.4);
    Point2d pos2 = new Point2d (5.5, 6.6);
    Point2d pos3 = new Point2d (7.7, 8.8);
    Poly poly = new Poly (4, pos0, pos1, pos2, pos3);
}
