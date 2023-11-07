import java.util.Scanner;
public class EnhancedForLoopFor2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit of 2 arrays:");
        int limit1=sc.nextInt();
        int limit2=sc.nextInt();
        int [][]a=new int[limit1][limit2];
        System.out.println("enter the numbers:");
        for(int i=0;i<limit1;i++){
            for(int j=0;j<limit2;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("elements in the form of 2D array:");
        for(int []array:a){ //first enhanced for loop for reading the values of each row
            for(int element:array){ //second enhanced for loop for reading each element in each row
            System.out.print(element+" ");
          }
          System.out.println();
        }
    }
}
