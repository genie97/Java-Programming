package myPackage;

public class Rectangle implements Shape {
	private double height,width;
	
	public Rectangle(double height, double width){
		this.height=height;
		this.width=width;
	}
	public double getArea(){
		return height*width;
	}
	public String toString(){
		return String.format("Height:%.2f Width:%.2f",height,width);
	}
	public boolean equals(Object otherObject){
		if(!(otherObject!=null&&otherObject instanceof Rectangle))
			return false;
		Rectangle r = (Rectangle)otherObject;
		return ((this.height==r.height)&&(this.width==r.width)) ;
	}
}
