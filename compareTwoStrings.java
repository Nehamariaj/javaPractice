import java.util.Scanner;
public class compareTwoStrings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st word:");
		String data1=sc.nextLine();
		System.out.println("enter the 2nd word:");
		String data2=sc.nextLine();
		int n1=data1.compareTo(data2);
	    if(data1.equalsIgnoreCase(data2)) {
	    	System.out.println("The two words are equal");
	    }
	    else if(n1<0) {
	    	System.out.println(data1+" is less than "+data2);
	    }
	    else {
	    	System.out.println(data1+" is greater than "+data2);
	    }
		}
	}

