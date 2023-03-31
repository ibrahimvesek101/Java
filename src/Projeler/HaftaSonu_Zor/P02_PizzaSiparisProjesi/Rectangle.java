package Projeler.HaftaSonu_Zor.P02_PizzaSiparisProjesi;

public class Rectangle extends IShape {
private double _width;
private double _height;
public Rectangle(double _width, double _height) {
	super();
	this._width = _width;
	this._height = _height;
}
@Override
public double getArea() {
	double area=_width*_height;
	return area;
}

@Override
public String toString() {
	return "Rectangle width=" + _width + ", _height=" + _height + ", getArea()=" + getArea();
}

 
}
