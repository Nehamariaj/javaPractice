import java.util.Scanner;
public class EnhancedForLoop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit:");
        int limit=sc.nextInt();
        int []a=new int[limit];
        System.out.println("enter the numbers:");
        for(int i=0;i<limit;i++){
            a[i]=sc.nextInt();
           }
           System.out.println("numbers:");
        for(int num:a){ /*"for-each“(Enhanced for ) loop is used exclusively to 
                          loop through elements in arrays*/
            System.out.print(num+" ");
        }
    }
}
