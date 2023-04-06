import java.util.Scanner;

public class lab1Pro3_64010609 {
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 1000 : ");
        Scanner input = new Scanner(System.in) ;
        int num = input.nextInt();
        int sum = 0;
        while(num > 0)
        {
            sum += num%10;
            num /= 10;
        }
        System.out.print("The sum of the digits is "+sum);
    }
}
