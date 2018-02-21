/* Write this concrete (non-abstract) class called Cylinder that extends Prism.  
 * It has a private field (radius) and inherits its height from its superclass, Prism 
 *    (because all prisms have a height).
 * Provide a constructor and the methods required by its abstract superclass.  
 */
//Jack Tan 2/21/18
public class Cylinder extends Prism{
	private int radius;
		public Cylinder(int radius, int height) {
			super(height);
			this.radius = radius;
		}
		public double calcAreaOfBase() { //Use area forumla for circle
			return (3.1415 * (radius * radius));
		}
		public double calcPerimeter() { // Find the perimeter of one circle
			double Circumfernce = 2 * radius * 3.1415;
			return Circumfernce ;
		}
		
		
	
	
}
