import java.util.Scanner;
class q4{
    public static void main(String [] args){
        Scanner inp=new Scanner(System.in);
    	System.out.print("First string: ");
	String str1=inp.nextLine();
	System.out.print("Second string: ");
	String str2=inp.nextLine();
	int count=0;
	for(int i=0;i<str1.length();i++){
	    for(int j=0;j<str2.length();j++){
	        if(str1.substring(i,i+1).equals(str2.substring(j,j+1))){
		    count+=1;
		    break;
		}
	    }
	}
	if(count==str1.length()){
	    System.out.println("It is an anagram");
	}
    }
}
