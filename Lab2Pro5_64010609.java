import java.util.Scanner;

public class Lab2Pro5_64010609 {
    public static void main(String[] args) {
        System.out.print("Enter the number of lines: ");
        Scanner input = new Scanner(System.in) ;
        int line = input.nextInt();
        if (line >0 && line <16){
        for (int i = 1;i<= line;i++){
            for (int j= 1; j <= (line - i)*2;j++){
                System.out.print(" ");
            }
            for (int k = i; k >=1 ; k--){
                System.out.print(" " + k);
            }
            for (int l = 2; l <=i ; l++){
                System.out.print(" " + l);
            }
            System.out.println();
            }

        }
    }
}

