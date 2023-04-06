import java.util.Scanner;

public class Lab2Pro3_64010609 {
    public static void main(String[] args) {

        int h;
        int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        String day[] = {"Saturday","Sunday","Monday","Tuesday","Wendesday","Thursday","Friday"};
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter year : ");
        int year = input.nextInt();

        if (year > 0){
            if((year%4 == 0 && year%100 !=0 )||year %400 == 0){
                month[1] = 29;
            }
            
            int j = year/100;
            int k = year%100;
            System.out.print("Enter month of the year : ");
            int m = input.nextInt();
            if (m > 0 && m < 13){
                    if(m>=1  && m<=12){
                        int dayofmonth = month[m-1];
                        if(m==1){
                        m = 13;
                        year--;
                        }
                        else if(m==2){
                        m = 14; 
                        year--;
                        }
                    System.out.print("Enter day of the month : ");
                    int q = input.nextInt();

                    if (q >0 && q <= dayofmonth){
                    h = (q+(26*(m+1)/10)+k/4+j/4+5*j+k)% 7;
                    System.out.print("The day is "+day[h]);
                    }
                    else {System.out.print("Eror because number of day is wrong");}
                }
            }
            else {System.out.print("Eror because number of month is wrong");}
        }
        else {System.out.print("Eror because number of year is wrong");}
    }
}
