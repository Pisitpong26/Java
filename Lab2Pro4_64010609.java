import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lab2Pro4_64010609 {
    public static void main(String[] args) {
        String cities[] = new String[3];
        System.out.print("Enter the first city: ");
        Scanner input = new Scanner(System.in) ;
        cities[0] = input.nextLine();
        System.out.print("Enter the second city: "); 
        cities[1] = input.nextLine();
        System.out.print("Enter the third city: ");
        cities[2] = input.nextLine();

        Arrays.sort(cities);
        System.out.println("The three cities in alphabetical order are " + Arrays.toString(cities));
    }
}
