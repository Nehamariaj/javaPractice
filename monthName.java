import java.util.Scanner;
public class monthName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Month Number:");
        int monthNumber=sc.nextInt();
         if(monthNumber >= 1 && monthNumber <= 12)
        System.out.print("The Month is "+getMonthName(monthNumber));
        else
        System.out.println(getMonthName(monthNumber)); 
    }

    public static String getMonthName(int monthNumber) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        if(monthNumber < 1 || monthNumber > 12) {
            return "Invalid month number. Please enter a number between 1 and 12.";
        }

        return months[monthNumber - 1];
    }
}
