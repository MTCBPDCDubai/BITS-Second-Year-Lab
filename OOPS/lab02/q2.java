import java.util.Scanner;
class Account{
    String name;
    int acc_no;
    float balance;
    Account(String n,int no,float b){
        name=n;
	acc_no=no;
	balance=b;
    }
    public void withdrawal(float amount1){
        balance-=amount1;    
    }
    public void deposit(float amount2){
        balance+=amount2;
    }
    public void check_balance(){
    	System.out.println("Name: "+name);
	System.out.println("Acc no: "+acc_no);
        System.out.println("Your balance is: "+balance);
    }
}
class q2{
    public static void main(String [] args){
	int ch=0,i=0;
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter your details: ");
	System.out.println("Enter your name: ");
	String Name=inp.nextLine();
	System.out.println("Enter your acc no.: ");
	int accno =inp.nextInt();
	System.out.println("Enter your account balance: ");
	float balance=inp.nextFloat();
	Account obj=new Account(Name,accno,balance);
	while(ch!=4){
	    System.out.println("1. Withdraw");
	    System.out.println("2. Deposit");
	    System.out.println("3. Display balance");
	    System.out.println("4. Exit");
	    ch=inp.nextInt();
	    if(ch==1){
	        System.out.println("Enter your withdrawal amount: ");
		float amnt1=inp.nextFloat();
		obj.withdrawal(amnt1);
	    }
	    else if(ch==2){
	        System.out.println("Enter your deposit amount: ");
		float amnt2=inp.nextFloat();
		obj.deposit(amnt2);
	    }
	    else if (ch==3){
	        obj.check_balance();
	    }
        }
    }
}
