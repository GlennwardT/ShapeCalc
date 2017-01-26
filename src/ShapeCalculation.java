import java.util.ArrayList;
import java.util.Scanner;

public class ShapeCalculation {

	
	
	public static class Shape {
		//attributes
		int numSides;
		double length;
		double apothem; //= (length/(2*tan(180/numSides)))
		double area;
		double perim;
		
		
		//behaviours
		void setNumSides(int n){
			this.numSides = n;
		}
		
		void setLength(double l){
			this.length = l;
		}
		
		double calcApothem(double l, int n){
			double a = (l/(2*Math.tanh(180/n)));
			return a;
		}
		
		double calcPerim(int n, double l){
			double p = n * l;
			return p;
		}
		
		double calcArea(double p, double a){
			double area = 0.5 * p * a;
			return area;
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		/*Shape shape = new Shape();
		
		System.out.println("This tool calculates the area and circumference of a box given the x and y lengths");
		System.out.println("Please enter the X length");
		shape.setXlength(in.nextDouble());
		System.out.println("Please enter the Y length");
		shape.setYlength(in.nextDouble());
		
		shape.area = shape.calcArea(shape.xlength, shape.ylength);
		System.out.println("The area of this shape is " + shape.area);
		shape.perim = shape.calcPerim(shape.xlength, shape.ylength);
		System.out.println("The perimeter of this shape is " + shape.perim);
		*/
		
		int numShapes = 0;
		char result;
		ArrayList<Shape> ShapeList = new ArrayList<Shape>();
		
		do {
			Shape shape = new Shape();
			numShapes++;
			
			System.out.println("Please enter the number of sides to your shape");
			shape.setNumSides(in.nextInt());
			
			System.out.println("Please enter the length of the sides to your shape");
			shape.setLength(in.nextDouble());
			
			shape.apothem = shape.calcApothem(shape.length, shape.numSides);
		
			shape.perim = shape.calcPerim(shape.numSides, shape.length);
			
			shape.area = shape.calcArea(shape.perim, shape.apothem);
		
			ShapeList.add(shape);
			System.out.println("Would you like to add another shape? (Y/N): ");
			result = Character.toLowerCase(in.next().charAt(0));
		} while(result =='y');
		
		for (int i = 0; i < numShapes; i++)
		{
			System.out.println("Shape " + (i+1) + ": " + "Apothem: " + ShapeList.get(i).apothem + ", Perimeter: " + ShapeList.get(i).perim + ", Area: " + ShapeList.get(i).area);
		}
		
		
		in.close();
		
	}

}
