import java.util.Scanner;
import java.lang.Math;
class q1{
    static String check_Id(int num){
        String idd=Integer.toString(num);
	if(idd.length()==2){
	    return "00";
	}
	else if(idd.length()==1){
	    return "000";
	}
	else{
	    return "0";
	}
    }
    static String check_campus(String loc){
	if(loc.equalsIgnoreCase("dubai")){
	    return "U";
	}
	else if(loc.equalsIgnoreCase("hyderebad")){
	    return "H";
	}
	else if(loc.equalsIgnoreCase("goa")){
	    return "G";
	}
	else return "";
    }
    public static void main(String [] args){
    	
        Scanner inp=new Scanner(System.in);
	System.out.print("Enter your year: ");
	String year=inp.nextLine();
	System.out.print("Enter your Discipline: ");
	String ds=inp.nextLine();
	System.out.print("PS/TS: ");
	String PTS=inp.nextLine();
	System.out.print("Campus: ");
	String cmp=inp.nextLine();
	String dsc=new String();
	if(ds.equalsIgnoreCase("cs")){
	    dsc="A7";
	}
	else if(ds.equalsIgnoreCase("mech")){
	    dsc="A8";
	}
	else if(ds.equalsIgnoreCase("biotech")){
	    dsc="A9";
	}
	int num=(int)(Math.random()*((300-1)+1))+1;
	String newloc=check_campus(cmp);
	System.out.println("Your id: "+year+dsc+PTS.toUpperCase()+check_Id(num)+num+newloc);
        System.out.println("Your email: f"+year+check_Id(num)+num+"@"+cmp.toLowerCase()+".bits-pilani.ac.in");
    }
}
