import java.util.Scanner;

public class Lab3_Pro3_64010609 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix : ");
        int size = input.nextInt();

        if (size >= 2){
        int[][] matrix = new int[size][size];
        for (int k=0;k<size;k++){
            for(int l = 0;l<size;l++){
                matrix[k][l] = (int)(Math.random() * 10) %2;
            }
        }
        for(int i = 0;i<size;i++){
            for(int j = 0;j<size;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int count=0;
        for(int i=0;i<matrix.length;i++){
            boolean num_same = true;
            for(int k=1;k<matrix[i].length;k++){
                if(matrix[i][0]!=matrix[i][k]){
                    num_same = false;
                }
            }
            if(num_same){
                System.out.println("All "+matrix[i][0]+"s on row "+(i+1));
                count++;
            }
        }
        if(count==0){
            System.out.println("No same numbers on a row");
        }

        count=0;
        for(int i=0;i<matrix[0].length;i++){
            boolean num_same = true;
            for(int k=1;k<matrix.length;k++){
                if(matrix[0][i]!=matrix[k][i]){
                    num_same = false;
                }
            }
            if(num_same){
                System.out.println("All "+matrix[0][i]+"s on column "+(i+1));
                count++;
            }
        }
        if(count==0){
            System.out.println("No same numbers on a column");
        }

        boolean num_super = true;
        for(int i=2;i<matrix.length;i++){
            if(matrix[0][1]!=matrix[i-1][i]){
                num_super = false;
            }
        }
        if(num_super){
            System.out.println("All "+matrix[0][1]+"s on the superdiagonal ");
        }
        else{
            System.out.println("No same numbers on the superdiagonal");
        }

        boolean num_diaonal = true;
        for(int i=1;i<matrix.length;i++){
            if(matrix[0][0]!=matrix[i][i]){
                num_diaonal = false;
            }
        }
        if(num_diaonal){
            System.out.println("All "+matrix[0][0]+"s on the diagonal ");
        }
        else{
            System.out.println("No same numbers on the diagonal");
        }
         boolean num_sub = true;
        for(int i=2;i<matrix.length;i++){
            if(matrix[1][0]!=matrix[i][i-1]){
                num_sub = false;
            }
        }
        if(num_sub){
            System.out.println("All "+matrix[1][0]+"s on the subdiagonal ");
        }
        else{
            System.out.println("No same numbers on the subdiagonal");
        }
    }
    else System.out.println("Error! : Please Enter number more than 1");
    }
}
