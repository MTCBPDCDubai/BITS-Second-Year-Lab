import java.util.Scanner;
class q3{
    public static void main(String[] args){
        float totalamt;
        Scanner inpt=new Scanner(System.in);
        System.out.println("Enter the Principal Amt: ");
        float p=inpt.nextFloat();
        System.out.println("Enter rate: ");
        float r=inpt.nextFloat();
        System.out.println("Enter Time period: ");
        int t=inpt.nextInt();
        totalamt=p*(1+((r/100)*t));
        System.out.println("Total amt: "+totalamt);
    }
}
