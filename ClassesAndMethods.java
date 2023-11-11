import java.util.Scanner;
class Box{
    double width;
    double height;
    double depth;
    public double calculateVolume(){
        double volume=width*depth*height;
        return volume;
    }
    public void Dimensions(double width,double height,double depth){
        this.width=width;
        this.depth=depth;
        this.height=height;
    }
}
public class ClassesAndMethods {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //parameters of 1st box
        Box box=new Box();
        System.out.println("enter the depth of the box1:");
        double depth=sc.nextDouble();
        System.out.println("enter the height of the box1:");
        double height=sc.nextDouble();
        System.out.println("enter the width of the box1:");
        double width=sc.nextDouble();
        box.Dimensions(width, height, depth);
        //parameters of 2nd box
        Box box1=new Box();
        System.out.println("enter the depth of the box2:");
        double Depth=sc.nextDouble();
        System.out.println("enter the height of the box2:");
        double Height=sc.nextDouble();
        System.out.println("enter the width of the box2:");
        double Width=sc.nextDouble();
        box1.Dimensions(Width, Height, Depth);
        System.out.println("volume of 1st box:"+box.calculateVolume());
        System.out.println("volume of 2nd box:"+box1.calculateVolume());
        //System.out.println("volume:"+vol);
    }
}
