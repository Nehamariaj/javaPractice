import java.util.Arrays;
import java.util.Scanner;
public class SortArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit:");
        int limit=sc.nextInt();
        int []a=new int[limit];
        System.out.println("enter the elements:");
        for(int i=0;i<limit;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Sorted array:");
        for(int element:a){
            System.out.print(element+" ");
        }
    }
}
