interface Apple{
    void printcomputePower();
}
class ipod implements Apple{
    String name;
    double cmpwr;
    ipod(String name,double cmpwr){
        this.name=name;
	this.cmpwr=cmpwr;
    }
    void setComputePower(double pw){
        cmpwr=pw;
    }
    public void printcomputePower(){
        System.out.println("The "+this.getClass()+" has a computing power of "+cmpwr+"MIPS");
    }
    void about(){
        System.out.println(this.getClass());
    }
}
class ipad implements Apple{
    String name;
    double cmpwr;
    ipad(String name,double cmpwr){
        this.name=name;
	this.cmpwr=cmpwr;
    }
    void setComputePower(double pwr){
        cmpwr=pwr;
    }
    public void printcomputePower(){
        System.out.println("The "+this.getClass()+" has a computing power of "+cmpwr+"MIPS");
    }
    void about(){
        System.out.println(this.getClass());
    }
}
class iphone implements Apple{
      String name;
      double cmpwr;
      iphone(String name,double cmpwr){
          this.name=name;
          this.cmpwr=cmpwr;
      }
      void setComputePower(double pwr){
          cmpwr=pwr;
      }
      public void printcomputePower(){
          System.out.println("The "+this.getClass()+" has a computing power of "+cmpwr+"MIPS");
      }
      void about(){
	  System.out.println(this.getClass());
      }
}
class q1{
    public static void main(String[] args){
        ipod obj1=new ipod("ipod nano",123.5d);
	ipad obj2=new ipad("ipad air",234.5d);
	iphone obj3=new iphone("iphone 11 pro",128.4d);
	obj1.about();obj1.printcomputePower();
	obj2.about();obj2.printcomputePower();
	obj3.about();obj3.printcomputePower();
    }
}
