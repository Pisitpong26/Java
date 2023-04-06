import java.util.Scanner;

public class Lab11Pro1_64010609 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] aray = createArray();
        boolean index = true;
        do {
        System.out.print("Enter the index of array : ");
        try{
            System.out.println("The corresponding element value is "+ aray[input.nextInt()]);
            index = false;
        }
        catch (Exception ex){
            System.out.println("Out of Bounds");
            System.exit(0);
        }
    }
    while (index);
    }

    public static int[] createArray(){
        int[] num = new int[100];
        for (int i = 0; i < num.length; i++){
            num[i] = (int)(Math.random() *100)+1;
        }
        return num;
    }
} 
