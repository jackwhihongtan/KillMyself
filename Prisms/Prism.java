/*Jack Tan 2/21/18
 *  Write this abstract class called Prism.  It has one private field (height) and a constructor.  
 * It contains the methods calcAreaOfBase, calcPerimeter, calcVolume, and calcSA.
 * None of these methods require parameters.   
 * A couple are abstract (An abstract method is a method that is declared, but contains no implementation. Abstract classes may not be instantiated, 
 * and require subclasses to provide implementations for the abstract methods.) - can you tell which ones and why?
 * 
 * Math note:
 * The volume of any prism can be found by multiplying the area of the base by the height.
 * The surface area of any prism can be found by multiplying the perimeter of the base by the height
 *   and then adding on the areas of the 2 bases.
 */

public abstract class Prism {
	private double height;

	// constructor
	public Prism(double height) {
		this.height = height;

	}

	// Method
	public abstract double calcAreaOfBase();

	public abstract double calcPerimeter();

	public double calcVolume() {
		return round2(calcAreaOfBase() * height);

	}

	public double calcSA() {
		return round2(((calcPerimeter() * height) + (calcAreaOfBase() * 2)));

	}

	public double getHeight() {
		return height;
	}

	public static double round2(double x) {
		double x_hundred = x * 100; // shift x two decimals to right
		double hundred = x_hundred % 1;
		double round = (x_hundred - hundred); // takes out the same numbers and leave the thousands place we need
		if (hundred >= 0.5) { // test for if we need to increment
			round += 1;
		} else if (hundred <= -0.5) { // test for if we need to decrement
			round -= 1;
		}
		double rounded = round / 100; // moves the value 2 places back to the left
		return rounded;

	}
}
	