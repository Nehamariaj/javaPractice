import java.util.Scanner;
public class getCharcterAtAnIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence:");
		String data=sc.nextLine();
		System.out.println("enter the position to view the letter:");
		int pos=sc.nextInt();
		char str1=data.charAt(pos-1);
		System.out.println("character at "+pos+" position "+str1);
		
	}
}
