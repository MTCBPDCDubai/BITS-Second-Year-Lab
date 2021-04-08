import java.util.*;
class checkbrac{
    static int check(String eqn,int i,char st){
        if(eqn.charAt(i)=='(' || eqn.charAt(i)=='{' || eqn.charAt(i)=='<' || eqn.charAt(i)==')' || eqn.charAt(i)=='}' || eqn.charAt(i)=='>'){
            if(st=='<' && eqn.charAt(i)=='>'){
                return 0;
            }  
            else if(st=='[' && eqn.charAt(i)==']'){
                return 0;
            }  
            else if(st=='{' && eqn.charAt(i)=='}'){
                return 0;
            }            
            else{
                return 1;
            }
        }
        else{
            return 2;
        }
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        ArrayList <Character> array=new ArrayList<Character>(1);
        System.out.print("Expression- ");
        String eqn=inp.nextLine();
        for(int i=0;i<eqn.length();i++){
            if(check(eqn,i,array.get(array.size()-1))==1){
                array.add(eqn.charAt(i));
            }
            else if(check(eqn,i,array.get(array.size()-1))==0){
                array.remove(array.get(array.size()-1));
            }
        }
        System.out.println(array);
        if(array.isEmpty()){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }
}