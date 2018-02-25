
public class Sphere extends ThreeDShape {
	private int radius;
		public Sphere(int radius) {
			this.radius = radius;
		}
		public double calcVolume() {
			return 4 /3 * 3.1415 * radius * radius * radius;
		}
		public double calcSA() {
			return 4 /3 * 3.1415 * radius * radius;
		}
}
