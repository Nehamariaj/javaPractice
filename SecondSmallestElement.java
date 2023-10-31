/**********************************************************************************
 * File:SecondSmallestElement.java
 * Description:To find the second smallest element in an array
 * Author:Neha Maria Joji
 * Version:1.0
 * Date:31/10/23
 **********************************************************************************/
package javaLab;
import java.util.Scanner;
public class SecondSmallestElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit of numbers:");
		int limit=sc.nextInt();
		int []a=new int [limit];
		int temp;
		System.out.println("enter the elements:");
		for(int i=0;i<limit;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<limit;i++) {
			for(int j=i+1;j<limit;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second Smallest Number in the given array is:"+a[1]);
	}

}
