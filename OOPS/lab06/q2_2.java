import java.util.Scanner;
class Book{
    private long ISBN_no;
    private String name;
    private int edition;
    private String author;
    private String publisher;
    private int status;
    Book(long ISBN_no,String name,int edition,String author,String publisher,int status){
        this.ISBN_no=ISBN_no;
	this.name=name;
	this.edition=edition;
	this.author=author;
	this.publisher=publisher;
	this.status=status;
    }
    void check_status(){
        if(status==0){
	    System.out.println("Available ");
	}
	else if(status==1){
	    System.out.println("Issued ");
	}
	else if(status==2){
	    System.out.println("Reserved ");
	}
    }
    void change_status(int sts){
        status=sts;
    }
    void display(){
        System.out.println("ISBN no: "+ISBN_no);
	System.out.println("Name: "+name);
	System.out.println("Edition: "+edition);
	System.out.println("Author: "+author);
	System.out.println("Publisher: "+publisher);
	System.out.println("Status: ");
	check_status();
    }
}
class q2_2{
    public static void main(String [] args){
        Scanner inp=new Scanner(System.in);Scanner inp2=new Scanner(System.in);
	Book [] bk=new Book [3];
	for(int i=0;i<3;i++){
	    System.out.println("Enter details for book "+(i+1)+": ");
	    System.out.println("ISBN no: ");long no=inp.nextLong();
	    System.out.println("Name: ");String nm=inp2.nextLine();
	    System.out.println("Edition: ");int ed=inp.nextInt();
	    System.out.println("Author: ");String ath=inp2.nextLine();
	    System.out.println("Publisher: ");String pub=inp2.nextLine();
	    System.out.println("Status(0,1,2): ");int sts=inp.nextInt();
	    bk[i]=new Book(no,nm,ed,ath,pub,sts);
	}
	int ch=0;
	while(ch!=4){
	    System.out.println("Press 1 to check status: ");
	    System.out.println("Press 2 to change status: ");
	    System.out.println("Press 3 to display: ");
	    System.out.println("Press 4 to quit: ");
	    ch=inp.nextInt();
	    if(ch==1){
	        for(int i=0;i<3;i++){
	            System.out.println("Status of book"+(i+1)+": ");bk[i].check_status();
	        }
	    }
	    else if(ch==2){
	        for(int i=0;i<3;i++){
	            System.out.println("Enter the new status for book"+(i+1)+": ");int n=inp.nextInt();
	            bk[i].change_status(n);
	    	}
	    }
	    else if(ch==3){
	        for(int i=0;i<3;i++){
		    bk[i].display();
		    System.out.println("------------------");
	        }
	    }
	}
    }
}
