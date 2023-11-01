import java.util.Scanner;
public class DegreeConversion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Which conversion u would like to do?\n1.Fahrenheit to Celsius\n2.Celsius to Fahrenheit");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("enter the fahrenheit:");
			double fah=sc.nextDouble();
			double cel=5*(fah-32)/9;
			System.out.println("Celsius="+cel);
		}
		else {
			System.out.println("enter the celsius:");
			double cel=sc.nextDouble();
			double fah=(9*cel+(32*5))/5;
			System.out.println("fahrenheit="+fah);
		}
	}
 
}
