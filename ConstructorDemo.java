
class Box1{
    double height;
    double width;
    double depth;
    Box1(){
        this.depth=10;
        this.height=20;
        this.width=30;
        System.out.println("Box constructor called!");
        System.out.println("depth: " + this.depth);
        System.out.println("height: " + this.height);
        System.out.println("width: " + this.width);
    }
}
public class ConstructorDemo {
    public static void main(String[] args){
        Box1 box=new Box1();
        System.out.println("depth of the box1:"+box.depth);
        System.out.println("height of the box1:"+box.height);
        System.out.println("width of the box1:"+box.width);
    }                                                           
}

