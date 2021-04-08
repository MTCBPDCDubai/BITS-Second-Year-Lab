import java.util.*;
class GCD{
    public static void main(String[] args) {
        int a,b,c;
        Scanner inp=new Scanner(System.in);
        System.out.print("a: ");a=inp.nextInt();
        System.out.print("b: ");b=inp.nextInt();
        if(a<b){
            c=a;
        }
        else{c=b;}
        while(c!=0){
            if(a%c==0 && b%c==0){
                System.out.println("GCD of "+a+", "+b+": "+c);
                break;
            }
        }
    }
}