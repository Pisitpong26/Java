import java.util.Scanner;

public class Lab2Pro1_64010609 {
    public static void main(String[] args) {
        String day[] = {"Sunday","Monday","Tuesday","Wendesday","Thursday","Friday","Saturday"};
        System.out.print("Enter today's day:");
        Scanner input = new Scanner(System.in) ;
        int firstnum = input.nextInt();
        System.out.print("Enter the number of days elapsed since today:");
        int secondnum = input.nextInt();
        int futureDay = (firstnum+secondnum) %7;

    if (firstnum >=0 && firstnum <=6 ){
        System.out.print("Today is "+ day[firstnum] +" and the future day is "+ day[futureDay]);}  
    else {System.out.print("Error because number is wrong");}
    }
}
