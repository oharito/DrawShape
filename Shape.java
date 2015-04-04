public abstract class Shape {
    private Point2d pos;

    public Point2d getPos() {
	return pos;
    }
    public void setPos(Point2d pos) {
	this.pos = pos;
    }
    public abstract void setShape();
    public abstract void drawShape();
}
