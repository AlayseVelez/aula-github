package entites;

public class Rectangle {

	public double width;
	public double height;
	
	public double AreaRectangle() {
		return  width*height;
	}
	public double Peimeter() {
		return (width*height) *2;
	}
	public double Diagonal(){
		return  Math.sqrt(height *height + width*width);
	}
	public String toString() {
		return "Area = " + String.format("%.2f ", AreaRectangle())+ "Perimeter = " 
	+ String.format("%.2f ", Peimeter())+ "Diagonal = "
				+String.format("%.2f", Diagonal());
	}
}
