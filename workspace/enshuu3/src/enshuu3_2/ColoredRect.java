package enshuu3_2;

public class ColoredRect implements Rect,Painted{
	int color = 255;

	public double getArea(double a,double b){
		return a*b;
	}

	public int getColor(){
		return color;
	}
}
