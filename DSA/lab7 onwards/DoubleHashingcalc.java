import java.util.*;
class DoubleHashingcalc{
    public static void main(String[] args) {
        int N,q;
        List <Integer> array = new ArrayList<Integer>();
        Scanner inp=new Scanner(System.in);
        Scanner inp2=new Scanner(System.in);
        System.out.print("N: ");N=inp.nextInt();
        System.out.print("q: ");q=inp.nextInt();
        System.out.println("Enter elements one by one...Press x to stop");
        while(inp.hasNextInt()){
            array.add(inp.nextInt());
        }
        System.out.println(array);
        System.out.println("k"+"\t"+"h(k)"+"\t"+"d(k)");
        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i)+"\t"+array.get(i)%N+"\t"+(q-(array.get(i)%q)));
        }            
    }
}