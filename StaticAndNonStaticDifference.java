public class StaticAndNonStaticDifference {
    public static void main(String[] args){
        NonStaticDemo nsd=new NonStaticDemo();
        int area=StaticDemo.area(10,10);
        int volume=nsd.volume(5,2,3);
        System.out.println("area of rectangle:"+area);
        System.out.println("volume of rectangle:"+volume);
    }
}
class StaticDemo{
    static int length;
    static int breadth;
    public static int area(int length,int breadth){
        return length*breadth;
    }
}
class NonStaticDemo{
    int length;
    int breadth;
    static int height=3;
    public int volume(int length,int breadth,int height){
        return length*breadth*height;
    }
    public static void getHeight(){
        System.out.println(height);
    }
}