package javaproject;
import java.util.StringTokenizer;
public class StringTokenizerDemo {
public static void main(String[] args) {
	System.out.println("USING SPACE HAS A DELIMITOR");
	StringTokenizer string=new StringTokenizer("This is a test");
	System.out.println("No Of Tokens="+string.countTokens());
	while(string.hasMoreTokens()) {
	System.out.println("NEXT TOKEN: "+string.nextToken());
     }
     System.out.println();
     
	System.out.println("USING COMMA HAS A DELIMITOR");
	StringTokenizer string1=new StringTokenizer("This,is,a,test",",");
	System.out.println("No Of Tokens="+string1.countTokens());
	while(string1.hasMoreTokens()) {
	System.out.println("NEXT TOKEN: "+string1.nextToken());
	}
	System.out.println();
	
	System.out.println("USING COMMA HAS A DELIMITOR & using boolean TRUE");
	StringTokenizer string2=new StringTokenizer("This,is,a,test",",",true);
	System.out.println("No Of Tokens="+string2.countTokens());
	while(string2.hasMoreTokens()) {
	System.out.println("NEXT TOKEN: "+string2.nextToken());
	}
	System.out.println();
	
	System.out.println("USING COMMA HAS A DELIMITOR & using boolean FALSE");
	StringTokenizer string3=new StringTokenizer("This,is,a,test",",",false);
	System.out.println("No Of Tokens="+string3.countTokens());
	while(string3.hasMoreTokens()) {
	System.out.println("NEXT TOKEN: "+string3.nextToken());
	}
	System.out.println();
}
}
