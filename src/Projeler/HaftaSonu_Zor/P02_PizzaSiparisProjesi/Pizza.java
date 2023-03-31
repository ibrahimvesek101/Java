package Projeler.HaftaSonu_Zor.P02_PizzaSiparisProjesi;

public class Pizza {
double _price;
IShape _shape;
public Pizza(double p,IShape s) {
	this._price=p;
	this._shape=s;
}
double getPrice() {
	return _price;
}
IShape getShape() {
	return _shape;
}
@Override
public String toString() {
	return "Pizza price=" + _price +"$" + ", Shape" + _shape ;
}



}
