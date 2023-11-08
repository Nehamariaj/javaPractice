import java.util.Arrays;
import java.util.Scanner;
public class SearchInAnArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit:");
        int limit=sc.nextInt();
        int[]a=new int[limit];
        System.out.println("enter the elements:");
        for(int i=0;i<limit;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);//always sort the elements before searching
        System.out.println("enter the element to be searched:");
        int search=sc.nextInt();
        int result=Arrays.binarySearch(a,search);//[Arrays.binarySearch() returns the address of the element in the array if found.
                                                 //Also if Arrays.binarySearch() >=0,the element is present in the array.
        if(result>=0){
             System.out.println(search+" is found at position "+(result+1));
        }
       else{
        System.out.println(search+" is not found in the array");
       }
    }
}
