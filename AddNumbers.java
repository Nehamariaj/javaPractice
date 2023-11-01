/**********************************************************************************
 * File:AddNumbers.java
 * Description:To print the sum of 'n' numbers.
 * Author:Neha Maria Joji
 * Version:1.0
 * Date:1/11/23
 **********************************************************************************/
import java.util.Scanner;
public class AddNumbers {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the limit:");
		int limit=sc.nextInt();
		int []a=new int[limit];
		int sum=0;
		System.out.println("enter the numbers:");
		for(int i=0;i<limit;i++) {
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum of Numbers:"+sum);
	}
        
}
