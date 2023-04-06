import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lab3_Pro2_64010609 {
    public static int[] merge(int[] list1,int[] list2){
        int fal = list1.length;
        int sal = list2.length;
        int[] mix = new int[fal+sal];
        System.arraycopy(list1, 0, mix,0, fal);  
        System.arraycopy(list2, 0, mix, fal, sal);
        Arrays.sort(mix);
        return mix;     
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store in List1: ");
        int n = input.nextInt();  
        int[] firstList = new int[n];
        System.out.print("Enter First List : ");
        for (int i = 0;i<n;i++){
            firstList[i] = input.nextInt();
        }
        System.out.print("Enter the number of elements you want to store in List2: ");
        int n2 = input.nextInt();  
        int[] secondList = new int[n2];
        System.out.print("Enter Second List : ");
        for (int j = 0;j<n2;j++){
            secondList[j] = input.nextInt();
        }
        int[]k = merge(firstList, secondList);
        for (int i=0;i<firstList.length+secondList.length;i++){
        System.out.print(" "+k[i]);}
    }
}
