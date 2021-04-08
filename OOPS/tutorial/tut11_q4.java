import java.util.*;
class Student{
    int rollno;
    String name,country;
    Student(int rollno,String name,String country){
        this.rollno=rollno;
	this.name=name;
	this.country=country;
    }
}
class SortbyRoll implements Comparator<Student>{
    public int compare(Student m,Student n){
        return m.rollno-n.rollno;
    }
}
class SortbyName implements Comparator<Student>{
    public int compare(Student m,Student n){
        return m.name.compareTo(n.name);
    }
}
class SortbyCountry implements Comparator<Student>{
    public int compare(Student m,Student n){
        return m.country.compareTo(n.country);
    }
}
class tut11_q4{
    public static void main(String[] args){
        ArrayList<Student> stud=new ArrayList <Student>();
	stud.add(new Student(12,"Sayantan","India"));
	stud.add(new Student(67,"Gokul","India"));
	SortbyRoll obj1=new SortbyRoll();obj1.compare(stud.get(0),stud.get(1));
	Collections.sort(stud,obj1);
	for(Student i:stud){
	    System.out.println(i.rollno);
	}
	SortbyName obj2=new SortbyName();obj2.compare(stud.get(0),stud.get(1));
	Collections.sort(stud,obj2);
	for (Student i:stud){
	    System.out.println(i.name);
	}
    }
}
