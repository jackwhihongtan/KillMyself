/* Write this concrete (non-abstract) class called Cylinder that extends Prism.  
 * It has a private field (radius) and inherits its height from its superclass, Prism 
 *    (because all prisms have a height).
 * Provide a constructor and the methods required by its abstract superclass.  
 */

public class Cylinder extends Prism{
	private int radius;
		public Cylinder(int radius, int height) {
			super(height);
			this.radius = radius;
		}
		public double calcAreaOfBase() { //Use area forumla for circle
			return (3.14 * (radius * radius));
		}
		public double calcPerimeter() { //2 circles and a rectanglse add them
			double Circumfernce = 2 * radius * 3.14;
			double rectanglePerimeter = height * Circumfernce;
			return (2 * Circumfernce) + rectanglePerimeter;
		}
		
	
	
}
