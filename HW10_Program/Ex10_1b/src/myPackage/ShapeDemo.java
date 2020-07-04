package myPackage;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape[] shape = new Shape[]
				{new Rectangle(7,9),new RightTriangle(10,5),new Circle(6)};
		for(int i=0;i<shape.length;i++){
			System.out.println(shape[i]);
		}
	}

}
