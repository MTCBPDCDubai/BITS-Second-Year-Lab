class circles{
    double r;
    String color;
    circles(){
        r=1.0d;
	color="Red";
    }
    circles(double r1){
        r=r1;
	color="Blue";
    }
    circles(String cl,double r2){
        color=cl;
	r=r2;
    }
    void getRadius(){
        System.out.println("Radius: "+r);
    }
    void getColor(){
    	System.out.println("Color: "+color);
    }
    void getArea(){
        double area=3.14*r*r;
    	System.out.println("Area: "+area);
    }
}
class q3{
    public static void main(String [] args){
        circles obj1=new circles();
	circles obj2=new circles(2.0d);
	circles obj3=new circles("Blue",2.0d);
	obj1.getRadius();
	obj1.getColor();
	obj1.getArea();
	obj2.getRadius();
	obj2.getColor();
	obj2.getArea();
	obj3.getRadius();
	obj3.getColor();
	obj3.getArea();
    }
}
