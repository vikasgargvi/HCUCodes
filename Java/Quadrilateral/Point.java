public class Point {

    private double x;
    private double y;
    
    public Point() {
        x = 0;
        y = 0;
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
	
	public double getdistance(Point p1) {
		double x2diff = Math.pow((this.x - p1.x),2);
		double y2diff = Math.pow((this.y - p1.y),2);
		double dis = Math.sqrt(x2diff + y2diff);
		return dis;
	}
	
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
}
