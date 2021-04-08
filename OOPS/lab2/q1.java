import java.util.Scanner;
class Rectangle{
    float length,width,area,perimeter;
    Rectangle(float l,float w){
    	length=l;
	width=w;
    }
    public float area(){
        area=length*width;
	return area;
    }
    public float perimeter(){
        perimeter=2*(length+width);
	return perimeter;
    }
}
class q1{
    public static void main(String [] args){
        float area1,area2,p1,p2;
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter the length and width of object1 respectively: ");
	float l1=inp.nextFloat();
	float b1=inp.nextFloat();
	System.out.println("Enter the length and width of object2 respectively: ");
	float l2=inp.nextFloat();
	float b2=inp.nextFloat();
        Rectangle obj1=new Rectangle(l1,b1);
        Rectangle obj2=new Rectangle(l2,b2);
        area1=obj1.area();
        p1=obj1.perimeter();
        area2=obj2.area();
        p2=obj2.perimeter();
	System.out.println("Area of object1: "+area1);
	System.out.println("Perimeter of object1:"+p1);
	System.out.println("Area of object2: "+area2);
	System.out.println("Perimeter of object2: "+p2);
        if(area1>area2){
	    System.out.println("Object 1 with length= "+l1+" and width= "+b1+" has a larger area.");
	}
	else{
	    System.out.println("Object 2 with length= "+l2+" and width= "+b2+" has a larger area.");
	}
	if(p1>p2){
	    System.out.println("Object 1 has a larger perimeter.");
	}
	else{
	    System.out.println("Object 2 has a larger perimeter.");
	}
    }
}
