import java.util.Scanner;
class CreditCard{
    private String name;
    private String cardNo;
    private boolean enabled;
    private int pin;
    private String expiryMonth;
    private int cardType;
    private int currentCredit;
    int creditLimit;
    protected CreditCard(String n,String no,boolean enb,int pn,String exp,int card,int crnt,int amt){
        name=n;
	cardNo=no;
	enabled=enb;
	pin=pn;
	expiryMonth=exp;
        cardType=card;
	currentCredit=crnt;
	creditLimit=amt;
    }
    protected void changepin(int no){
        pin=no;
	System.out.println("Pin number changed");
    }
    protected void transact(int amt,int no){
        if(enabled==true && pin==no && creditLimit>amt){
	    System.out.println("The card is valid.");
	    currentCredit-=amt;
	    System.out.println("Current credit: "+currentCredit);
	}
	else{
	    System.out.println("The card is invalid.");
	}
    }
    protected void changeCardStatus(boolean sts){
        enabled=sts;
	System.out.println("Status changed to: "+sts);
    }
    protected void display(){
        System.out.println("Name: "+name);
	System.out.println("Card no: "+cardNo);
	System.out.println("Status: "+enabled);
	System.out.println("Pin number: "+pin);
	System.out.println("Expiry date: "+expiryMonth);
	System.out.println("Card type: "+cardType);
	System.out.println("Current credit: "+currentCredit);
        if(cardType==1){
	    System.out.println("Silver- 1% discount offered.");
	}
        else if(cardType==2){
	    System.out.println("Gold- 2% discount offered");	
	}
	else if(cardType==3){
	    System.out.println("Platinum- 3% discount offered");
	}
    }
}
class q1{
    public static void main(String [] args){
    	Scanner inp=new Scanner(System.in);
	System.out.println("Enter your name: ");
	String n=inp.nextLine();
	System.out.println("Enter your card no: ");
	String crdno=inp.nextLine();
	System.out.println("Enter the expiry date: ");
	String dte=inp.nextLine();
	System.out.println("Enter your card status: ");
	boolean stus=inp.nextBoolean();
	System.out.println("Enter your pin: ");
	int pn=inp.nextInt();
	System.out.println("Enter the card type: ");
	int crdtype=inp.nextInt();
	System.out.println("Enter your current amount: ");
	int crnt=inp.nextInt();
        CreditCard c = new CreditCard(n,crdno,stus,pn,dte,crdtype,crnt,1000);
	int ch=0;
	while(ch!=5){
	    System.out.println("Press 1 to change pin");
	    System.out.println("Press 2 for transaction");
	    System.out.println("Press 3 to change card status");
	    System.out.println("Press 4 to display");
	    System.out.println("Press 5 to quit");
	    ch=inp.nextInt();
            if(ch==1){
	        System.out.println("Enter the new pin: ");
		int a= inp.nextInt();
		c.changepin(a);
	    }
	    else if(ch==2){
	        System.out.println("Enter the amount you want to retrieve: ");
	        int amt=inp.nextInt();
		System.out.println("Enter your card pin no: ");
		int no=inp.nextInt();
		c.transact(amt,no);
	    }
	    else if (ch==3){
	        System.out.println("Enter the status you want to change to: ");
		boolean sts=inp.nextBoolean();
   		c.changeCardStatus(sts);
	    }
	    else if(ch==4){
	        c.display();
	    }
	}
    }
}
