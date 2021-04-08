import java.util.*;
class Shape{
    private String color;
    private boolean filled;
    public Shape(){
        color="Green";
	filled=true;
    }	
    public Shape(String color,boolean filled){
        this.color=color;
	this.filled=filled;
    }
    public String getColor(){
    	return color;
    }
    public void setColor(String cl){
	color=cl;
    }
    public boolean isFilled(){
    	return filled;
    }
    public void setFilled(boolean fl){
    	filled=fl;
    }
    public String toString(){
    	String fl;
	fl=(filled)?"filled":"not filled";
        return("A shape with color of "+color+" and "+fl);
    }
}
class Circle extends Shape{
    private double radius;
    public Circle(){
    	super();
        radius=1.0d;
    }
    public Circle(double radius){
    	super();
	this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
	this.radius=radius;
    }
    public void getRadius(){
    	System.out.println("Radius: "+radius);
    }
    public void setRadius(double rad){
        radius=rad;
    }
    public double getArea(){
    	return (radius*radius*3.14);
    }
    public double getPerimeter(){
        return (2*3.14*radius);
    }
    public String toString(){
    	return("A circle with radius "+radius+"which is a subclass of "+super.toString());
    }

}
class Rectangle extends Shape{
    private double width,length;
    public Rectangle(){
        super();
	width=1.0d;
	length=1.0d;
    }
    public Rectangle(double width,double length){
    	super();
	this.width=width;
	this.length=length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
	this.width=width;
	this.length=length;
    }
    public void getWidth(){
        System.out.println("Width: "+width);
    }
    public void setWidth(double w){
    	width=w;
    }
    public void getLength(){
        System.out.println("Length: "+length);
    }
    public void setLength(double l){
    	length=l;
    }
    public double getArea(){
        return (length*width);
    }
    public double getPerimeter(){
    	return (2*(length+width));
    }
    public String toString(){
        return("A rectangle with width "+width+" and length "+length+" which is a subclass of "+super.toString());
    }
}
class Square extends Rectangle{
    private double side;
    public Square(){
    	super();
        side=1.0d;
    }
    public Square(double side){
        super();
	this.side=side;
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
	this.side=side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double s){
        side=s;
    }
    public void setWidth(){
    	super.setWidth(side);
    }
    public void setLength(){
        super.setLength(side);
    }
    public String toString(){
        return("A square of side "+side+" which is a subclass of "+super.toString());
    }
}
class q1{
    public static void main(String[] args){
        Circle c=new Circle(2.5d,"Red",true);
	Rectangle rc=new Rectangle(3.4d,5.5d,"Green",false);
	Square sq=new Square(4.5d,"Blue",true);
	System.out.println("-----Circle-----");
	System.out.println("Area: "+c.getArea());
	System.out.println("Perimeter: "+c.getPerimeter());
	System.out.println(c.toString());
	System.out.println("-----Rectangle-----");
	System.out.println("Area: "+rc.getArea());
	System.out.println("Perimeter: "+rc.getPerimeter());
	System.out.println(rc.toString());
	System.out.println("-----Square-----");
	System.out.println("Area: "+sq.getArea());
	System.out.println("Perimeter: "+sq.getPerimeter());
	System.out.println(sq.toString());
    }
}
