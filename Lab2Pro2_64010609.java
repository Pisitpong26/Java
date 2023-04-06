import java.util.Scanner;

public class Lab2Pro2_64010609 {
    public static void main(String[] args) {
        String role[] = {"scissor", "rock", "paper"};
        System.out.print("scissor (0), rock (1), paper (2):");
        Scanner input = new Scanner(System.in) ;
        int you = input.nextInt();
        int com = (int)(Math.random() * 10) %3;
    if (you >= 0 && you <= 2){
        if (you == com){
            System.out.print("The computer is "+ role[com] +".You are "+role[you]+" too. It is a draw");
        }
        else if (you == com+1 || you == com-2){
            System.out.print("The computer is "+ role[com] +".You are "+role[you]+". You won");
        }
        else  {System.out.print("The computer is "+ role[com] +".You are "+role[you]+". You Lose");}
        }
    else {System.out.print("Eror because number is wrong");}
    }
}
