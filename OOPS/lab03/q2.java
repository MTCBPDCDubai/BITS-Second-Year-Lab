class Employee{
    private String id;
    private String name;
    private int dept;
    private float basic;
    private float allowance;
    private float total_sal;
    private float hra;
    protected Employee(String d,String n,int dep,float b){
        id=d;
	name=n;
	dept=dep;
	basic=b;
    }
    protected void calSal(){
        hra=(40/100)*basic;
	if(dept==1){
	    allowance=1500;
	}
	else if(dept==2){
	    allowance=2500;
	}
	else if(dept==3){
	    allowance=3500;
	}
	total_sal=hra+basic+allowance;
	System.out.println("Total salary: "+total_sal);
    }
    protected void displaydeatils(){
        System.out.println("Id: "+id);
	System.out.println("Name: "+name);
	System.out.println("Department: "+dept);
	System.out.println("Total salaray: "+total_sal);
    }
}
class q2{
    public static void main(String [] args){
        Employee emp = new Employee("1234","Gokul",1,1200);
        emp.calSal();
        emp.displaydeatils();
    }
}
