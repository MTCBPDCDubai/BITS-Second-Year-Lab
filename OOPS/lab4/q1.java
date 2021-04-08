import java.util.Scanner;
class Area{
    private float side1=0,side2=0;
    public int calc_Area(int a){
        return (a*a);
    }
    public float calc_Area(float a){
        return (3.14f*a*a);
    }
    public float calc_Area(float a1,float a2){
        side1=a1;
	side2=a2;
	return (side1*side2);    
    }
}
class q1{
    public static void main(String [] args){
        Area obj=new Area();
	Scanner inp=new Scanner(System.in);
	int area1=obj.calc_Area(2);
	float area2=obj.calc_Area(2.5f);
	float area3=obj.calc_Area(2.5f,2.5f);
	System.out.println("Press 1 for square: ");
	System.out.println("Press 2 for circle: ");
	System.out.println("Press 3 for rectangle: ");
	int ch=inp.nextInt();
	switch(ch){
	    case 1:
	    	System.out.println("Area of square with 1 int: "+area1);
	    	break;
	    case 2:
	        System.out.println("Area of circle with 1 float: "+area2);
	    	break;
	    case 3:
	        System.out.println("Area of rectangle with 2 floats: "+area3);
            	break;
	    default:
	        System.out.println("Invalid selection");
        }
    }
}
