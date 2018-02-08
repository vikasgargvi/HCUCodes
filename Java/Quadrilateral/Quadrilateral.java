
public class Quadrilateral {
    
    private Point corner1;
    private Point corner2;
    private Point corner3;
    private Point corner4;
	

    public Quadrilateral(Point newCorner1, Point newCorner2, Point newCorner3, Point newCorner4) {
        corner1 = new Point(newCorner1.getX(), newCorner1.getY());
        corner2 = new Point(newCorner2.getX(), newCorner2.getY());
        corner3 = new Point(newCorner3.getX(), newCorner3.getY());
        corner4 = new Point(newCorner4.getX(), newCorner4.getY());
    }
    
    public String toString() {
        return "Point 1 = " + corner1 + "\n" + "Point 2 = " + corner2 + "\n" + "Point 3 = " + corner3 + "\n" + "Point 4 = " + corner4;
    }	
    
    /*
    public boolean isRectangle() {
        double dist1to4 = Math.pow(corner1.getX() - corner4.getX(), 2) + Math.pow(corner1.getY() - corner4.getY(), 2);
        double dist1to2 = Math.pow(corner1.getX() - corner2.getX(), 2) + Math.pow(corner1.getY() - corner2.getY(), 2);
        double dist3to4 = Math.pow(corner3.getX() - corner4.getX(), 2) + Math.pow(corner3.getY() - corner4.getY(), 2);
        double dist3to2 = Math.pow(corner3.getX() - corner2.getX(), 2) + Math.pow(corner3.getY() - corner2.getY(), 2);
        double dist2to4 = Math.pow(corner2.getX() - corner4.getX(), 2) + Math.pow(corner2.getY() - corner4.getY(), 2);
        
        //sum a^2 + b^2
        double ab1 = dist1to4 + dist1to2;
        double ab2 = dist3to4 + dist3to2;
        
        //calculate (a^2+b^2) - c^2
        double ab_c1 = Math.abs(ab1-dist2to4);
        double ab_c2 = Math.abs(ab2-dist2to4);
        
        //return the result of whether the angles are very close to a
        //right angle or not close
        return ((ab_c1 < 1e-6) && (ab_c2 < 1e-6));
    }
    
    public boolean isSquare() {
        if (isRectangle()) {
                double dist1to4 = Math.pow(corner1.getX() - corner4.getX(), 2) + Math.pow(corner1.getY() - corner4.getY(), 2);
                double dist1to2 = Math.pow(corner1.getX() - corner2.getX(), 2) + Math.pow(corner1.getY() - corner2.getY(), 2);
                double dist3to4 = Math.pow(corner3.getX() - corner4.getX(), 2) + Math.pow(corner3.getY() - corner4.getY(), 2);
                double dist3to2 = Math.pow(corner3.getX() - corner2.getX(), 2) + Math.pow(corner3.getY() - corner2.getY(), 2);
                
                //calculate the difference in lengths between sides
                double dist14_12 = Math.abs(dist1to4 - dist1to2);
                double dist34_32 = Math.abs(dist3to4 - dist3to2);
                double dist14_32 = Math.abs(dist1to4 - dist3to2);
                
                //if the differences are neglible, it's a square
                if (dist14_12 < 1e-6 && dist34_32 < 1e-6 && dist14_32 < 1e-6) {
                	return true;
                }
         }
        return false;
    }
   */
    public double getperimeter(){
		return corner1.getdistance(corner2) + corner2.getdistance(corner3) + corner3.getdistance(corner4) + corner4.getdistance(corner1);
	}
	
	private double area(Point p1, Point p2, Point p3) {
		double side1 = p1.getdistance(p2);
		double side2 = p2.getdistance(p3);
		double side3 = p3.getdistance(p1);
		
		double semi_perimeter = (side1 + side2 + side3)/2;
		
		return Math.sqrt(semi_perimeter * (semi_perimeter - side1) * (semi_perimeter - side2) * (semi_perimeter - side3));
	}
	
	public double getarea() {
		return area(corner1, corner3, corner2) + area(corner1, corner3, corner4);	
	}
}
