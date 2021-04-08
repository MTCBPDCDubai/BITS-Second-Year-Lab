import java.util.*;
class Student{
    int Id;
    String Name;
    int marks1,marks2,marks3;
    float percent;
    Student(){
    
    }
    void get_name(String n,int id,int m1,int m2,int m3){
    	Id=id;
	Name=n;
	marks1=m1;
	marks2=m2;
	marks3=m3;
    }
    void calculate_percentage(){
    	percent=(marks1+marks2+marks3)/3;
    	System.out.println("Percentage: "+percent);
    }
    void display(){
        System.out.println("Name: "+Name);
	System.out.println("Id: "+Id);
	System.out.println("Percentage: "+percent);
    }
    static void find_maxmin(ArrayList<Student> studarr){
    	float max=studarr.get(0).percent;
	float min=studarr.get(0).percent;
	for(Student i:studarr){
	    if(i.percent>max){
	        max=i.percent;
	    }
	    else if(i.percent<min){
	        min=i.percent;
	    }
	}
	for(Student i:studarr){
	    if(i.percent==max){
	    	System.out.println("Student with maximum marks: ");
	        i.display();
	    }
	    if(i.percent==min){
	    	System.out.println("Student with minimum marks: ");
	        i.display();
	    }
	}
    }
}
class q1{
    public static void main(String [] args){
    	ArrayList <Student> studarr=new ArrayList<Student>();
	int ch=1;
	Scanner inp=new Scanner(System.in);Scanner inp2=new Scanner(System.in);
	while(ch!=3){
	    System.out.println("Press 1 to add student details and find the percentage.");
	    System.out.println("Press 2 to find the student with maximum percentage.");
	    System.out.println("Press 3 to exit.");
	    ch=inp.nextInt();
	    if(ch==1){
	    	System.out.print("Enter student name: ");
		String n=inp2.nextLine();
		System.out.print("Enter student id: ");
		int id=inp.nextInt();
		System.out.println("Enter the three marks: ");
		int m1=inp.nextInt();int m2=inp.nextInt();int m3=inp.nextInt();
		Student stud=new Student();
		stud.get_name(n,id,m1,m2,m3);
		stud.calculate_percentage();
		studarr.add(stud);
	    }
	    else if(ch==2){
	    	Student.find_maxmin(studarr);
	    }
	}
    }
}
