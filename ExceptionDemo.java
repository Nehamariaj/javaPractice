import java.util.Scanner;
class ArithmeticExceptionDemo{
    public void divide(){
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("enter 2 numbers to divide:");
        double num1=sc.nextInt();
        double num2=sc.nextInt();
        if(num2==0){
            throw new ArithmeticException();
        }
        else{
            double result=num1/num2;
            System.out.println("Result="+result);
        }
    }catch(ArithmeticException e){
        System.out.println("Divison by zero not possible");
    }
}
}

class NullPointerExceptionDemo{
   public void NPE(){
    try{
    String s=null;
    System.out.println(s.length());
   }catch(NullPointerException e){
    System.out.println("There is no word to display..So,Null Pointer Exception");
   }
}
}

class NumberFormatExceptionDemo{
    public void NFE(){
        try{
        String x="abc";
        int i=Integer.parseInt(x);
        System.out.println(i);
        }catch(NumberFormatException e){
            System.out.println("Since there is no numbers in the given string it will show 'Number Format Exception'.");
        }
    }
}

class ArrayIndexOutOfBoundsExceptionDemo {
    public void AIOOB() throws ArrayIndexOutOfBoundsException {
        int a[]=new int[5];
        a[10]=50;
    }
    public void throwing(){
        try{
            AIOOB();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Cannot store value since the limit of array is only upto 5(ArrayIndexOutOfBoundsException)");
        }
    }
}
public class ExceptionDemo {
    public static void main(String[] args){
        ArithmeticExceptionDemo arithmeticExceptionDemo=new ArithmeticExceptionDemo();
        arithmeticExceptionDemo.divide();
        System.out.println("******************************************************************");

        NullPointerExceptionDemo nullPointerExceptionDemo=new NullPointerExceptionDemo();
        nullPointerExceptionDemo.NPE();
        System.out.println("******************************************************************");

        NumberFormatExceptionDemo numberFormatExceptionDemo=new NumberFormatExceptionDemo();
        numberFormatExceptionDemo.NFE();
        System.out.println("******************************************************************");

        ArrayIndexOutOfBoundsExceptionDemo arrayIndexOutOfBoundsExceptionDemo=new ArrayIndexOutOfBoundsExceptionDemo();
        arrayIndexOutOfBoundsExceptionDemo.throwing();
        System.out.println("******************************************************************");
    }
}
