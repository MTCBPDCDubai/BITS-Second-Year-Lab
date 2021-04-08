import java.util.Scanner;
class q3{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
	System.out.print("Enter your name: ");
        String name=inp.nextLine();
	String[] namearr=name.split(" ");
	for(int i=0;i<namearr.length;i++){
	    System.out.print(namearr[i].substring(0,1));
	}
	System.out.println();
    }
}
