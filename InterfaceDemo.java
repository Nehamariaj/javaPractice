import java.util.Scanner;
interface Shape{
    void shapeType();
}
interface Polygon{
    void getArea(int length,int breadth);
}
class Rectangle implements Polygon,Shape{ //a class that implements 2 interfaces
    public void getArea(int length,int breadth){
        System.out.println("Area="+(length*breadth));
    }
    public void shapeType(){
        System.out.println("Shape:Rectangle");
    }
   
}
interface Square extends Shape{ //a interface which extends another interface
    void sides();
}
class Square1 implements Square{
    public void shapeType(){
        System.out.println("Shape:Square");
    }
    public void sides(){
        System.out.println("I have 4 sides");
    }
}
class Triangle extends AreaOfTriangleUsingHeronsFormula implements Shape{  //class which extends a class(not defined in this class but as another class in this package) and implements a interface
     public void shapeType(){
        System.out.println("Shape:Triangle");
    }
    public void area(){
        System.out.println("Area="+calculatingArea(3,3,3)); //reusing a method which is already defined in a different class of same package 
    }
}
public class InterfaceDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length and breadth of rectangle:");
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        System.out.println();
        //Rectangle
        Rectangle rectangle=new Rectangle();
        rectangle.shapeType();
        rectangle.getArea(length, breadth);
        System.out.println();
        //Square
        Square1 square1=new Square1();
        square1.shapeType();
        square1.sides();
        System.out.println();
        //Triangle
        Triangle triangle=new Triangle();
        triangle.shapeType();
        triangle.area();
        System.out.println();
    }
}
