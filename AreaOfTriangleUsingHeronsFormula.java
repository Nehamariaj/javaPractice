import java.util.Scanner;
public class AreaOfTriangleUsingHeronsFormula {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input Side 1:");
        double s1=sc.nextDouble();
        System.out.print("Input side 2:");
        double s2=sc.nextDouble();
        System.out.print("Input side 3:");
        double s3=sc.nextDouble();
        double area=calculatingArea(s1,s2,s3);
        System.out.println("Area of triangle="+area);
    }
    static double calculatingArea(double s1,double s2,double s3){
         double s=(s1+s2+s3)/2;
        double area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        return area;
    }
       
    }
