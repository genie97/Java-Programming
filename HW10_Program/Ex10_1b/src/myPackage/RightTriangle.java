package myPackage;

public class RightTriangle implements Shape {
	
	private double height,width;
	
	public RightTriangle(double height, double width){
		this.height=height;
		this.width=width;
	}
	public double getArea(){
		return height*width/2.0;
	}
	public String toString(){
		return String.format("Height:%.2f Width:%.2f",height,width);
	}
	public boolean equals(Object otherObject){
		if(!(otherObject!=null&&otherObject instanceof Rectangle))
			return false;
		RightTriangle t = (RightTriangle)otherObject;
		return ((this.height==t.height)&&(this.width==t.width)) ;
	}
}
