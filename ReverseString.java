/**********************************************************************************
 * File:ReverseString.java
 * Description:To Reverse a String
 * Author:Neha Maria Joji
 * Version:1.0
 * Date:31/10/23
 **********************************************************************************/
package javaLab;
import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word:");
		String word=sc.next();
		int length=word.length();
		char a[]=word.toCharArray();
		System.out.print("Reversed String:");
		for(int i=length-1;i>=0;i--) {
			System.out.print(""+a[i]);
		}
	}
}
