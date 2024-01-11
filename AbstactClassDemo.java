public class AbstactClassDemo {
    public static void main(String [] args){
        hello.print();
        Message message=new Message();
        message.say();
    }
}
abstract class hello{
    public static void print(){
        System.out.println("Hello everybody");
    }
    abstract void say();
}
class Message extends hello{
     void say(){
        System.out.println("Good Morning");
    } 
}