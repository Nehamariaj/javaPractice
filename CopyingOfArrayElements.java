import java.util.Scanner;
public class CopyingOfArrayElements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit:");
        int limit=sc.nextInt();
        int []a=new int [limit];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<limit;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the starting and ending position from where the elements need to be copied from:");
        int start=sc.nextInt();
        int end=sc.nextInt();
        int []copyTo=new int [(end-start)+1];
        System.arraycopy(a,(start-1), copyTo, 0, ((end-start)+1));
        for(int elements:copyTo){
            System.out.print(elements+" ");
        }
    }
    
}
