import java.util.Arrays;
import java.util.Scanner;
public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Search search=new Search();
        System.out.println("enter the no of elements:");
        search.num=sc.nextInt();//since num is variable of class Search,we used search.num..otherwise we nee to pass the variable
        int []A=new int[search.num];
        System.out.println("enter the elements:");
        for(int i=0;i<search.num;i++){
            A[i]=sc.nextInt();
        }
        Arrays.sort(A);
        System.out.println("Sorted array:");
        for(int element:A){
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println("enter the element to search:");
        int x=sc.nextInt();
        int elementFound=search.recursiveLinearSearch(A,0,x);//here the value of i is set to 0 
        if(elementFound==-1){
            System.out.println(x+" is not present in the list");
        }
        else{
            System.out.println(x+" is present in the list at position "+(elementFound+1));
        }
    }
}
class Search{
    int num;
    public int recursiveLinearSearch(int []A,int i,int x){
        if(i>num-1){//this means the value is not present in the list
            return -1;
        }
        else if(A[i]==x){
            return i;
        }
        else{
            return recursiveLinearSearch(A,i+1,x);//this line calls the method in line 26 again and the process from line 27 to 34 is continued till the desired result is obtained
        }
    }
}