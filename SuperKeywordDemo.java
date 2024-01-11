class animal1{
    String classType="super class";
    public void displayFeature(){
        System.out.println("I am a animal.");
    }
    animal1(){
        System.out.println("Dogs are friendly:)");
    }
    animal1(int legs){
        System.out.println("Dogs have "+legs+" legs");
    }
}
class dog1 extends animal1{
    String classType="child class";
    dog1(){
        super(4); //calls the parameterized constructor of parent class 
        //No 2 super keyword can be used in a single constructor  
    }
    public void displayFeature(){
        System.out.println("I am a Dog.");
    }
    public void printMessage(){
        super.displayFeature();    //prints i am animal
        System.out.println("I am getting printed from "+super.classType);      //prints parent/super class
        displayFeature();     //prints i am dog
        System.out.println("I am getting printed from "+classType);  //prints child class
    }
}
public class SuperKeywordDemo {
    public static void main(String [] args){
        dog1 dg=new dog1();
        dg.printMessage();
    }
}
