package week5;

public class Rectangle implements Shape{

		private double width;
		private double length;
		private double area;
		private double perimeter;
		public Rectangle(double width, double length, double perimeter, double area) {
			this.width = width;
			this.length = length;
			this.perimeter = 2*(length+width);
			this.area = width * length;
			

		}

		public double getWidth() {
			return width;
		}

		public void setWidth(double width) {
			this.width = width;
			area = width * length;
			perimeter = 2*(length+width);
		}

		public double getLength() {
			return length;
		}

		public void setLength(double length) {
			this.length = length;
			area = width * length;
			perimeter = 2*(length+width);
		}
		public double getArea() {
			return area;
		}


}
