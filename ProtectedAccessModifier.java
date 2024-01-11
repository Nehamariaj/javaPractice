public class ProtectedAccessModifier {
    public static void main(String[] args){
        Dog dog=new Dog();
        //dog.color is not visible to the main class since it is declared as private.
        dog.type="MAMMAL";
        dog.eat();
        dog.setColour("BLACK");
        dog.displayInfo();
    }
}
class Animals{
    protected String type;
    private String color;//only visible to class animal.It cannot be inherited.
    public void eat(){
        System.out.println("I can eat");
    }
    public void setColour(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
}
class Dog extends Animals{
    public void displayInfo(){
        System.out.println("I am a "+type);
        System.out.println("My color is "+getColor());
    }
}