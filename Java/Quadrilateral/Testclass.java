import java.util.*;

class Testclass {

	public static void main(String[] args){
		
		
		double x1, x2, x3, x4, y1, y2, y3, y4;
		Point p1, p2, p3, p4;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		
		System.out.print("Enter a point's x- and y-coordinates: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		System.out.print("Enter a point's x- and y-coordinates: ");
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		
		System.out.print("Enter a point's x- and y-coordinates: ");
		x4 = input.nextDouble();
		y4 = input.nextDouble();
		
		// Get 4 points
		p1 = new Point(x1,y1);
		p2 = new Point(x2,y2);
		p3 = new Point(x3,y3);
		p4 = new Point(x4,y4);
		
		Quadrilateral quad = new Quadrilateral(p1, p2, p3, p4);
		System.out.println("The perimeter of the quadrilateral is "+ quad.getperimeter() + " and area is "+ quad.getarea());
	}
}
