import java.util.Arrays;

public class Lab4Pro3_64010609 {
    public static boolean isPrime(int n) {  
        if (n <= 1) {  
            return false;  
        }  
        for (int i = 2; i <= Math.sqrt(n); i++) {  
            if (n % i == 0) {  
                return false;  
            }  
        }  
        return true;  
    }  
    public static void main(String[] args) {
        StopWatch count = new StopWatch();
        double[] numrand = new double[1000];
        int line1 = 1;
        System.out.println(" Creating a list containing 1000 elements");
        for(int i = 0;i<1000;i++){
            numrand[i] = (double)(Math.random()*1000);
            if (line1 <=10){
            System.out.print("  "+(Math.round(numrand[i]*100.0)/100.0));
            line1++;
            }
            else{
                System.out.println("  "+(Math.round(numrand[i]*100.0)/100.0));
                line1 = 1;
            }
        }
        System.out.println("\n List created");
        System.out.println(" Sorting stopwatch starts...");

        Arrays.sort(numrand);
        count.start();
        for(int i = 0;i<1000;i++){
            if (line1 <=10){
            System.out.print("  "+(Math.round(numrand[i]*100.0)/100.0));
            line1++;
            }
            else{
                System.out.println("  "+(Math.round(numrand[i]*100.0)/100.0));
                line1 = 1;
            }
        }
        count.stop();
        System.out.println("\n Sorting stopwatch stoped.");
        System.out.println(" The sort time is "+count.getElapsedTime() +" milliseconds");
        System.out.println("-------------------------------------");
        int sum = 0,reCheck,num=0,numArray=0,line=1;
        int palindrom[] = new int[1000];
        count.start();
        System.out.println("The palindromPrime stopwatch starts...");
        System.out.println("Creating 1000 PalindromPrime...");
        while (numArray<1000){
            int check=num;
                while(check>0){
                reCheck = check%10;
                sum = (sum*10)+reCheck;
                check /= 10;    
                }
                if(num == sum){
                    if (isPrime(sum)){
                    if (numArray<1000){
                    palindrom[numArray] = num;
                    if (line >=10){
                        System.out.println(" "+palindrom[numArray]);
                        line = 1;
                    }
                    else {
                        System.out.print(" "+palindrom[numArray]);
                        line++;
                    }
                    numArray++;
                    }
                    }
                    sum = 0;
                
                }
                else {sum = 0;}       
            num++;  
        }
        count.stop();
        System.out.println(" PalindromePrime created.");
        System.out.println(" The palindromPrime stopwatch stoped.");
        System.out.println(" The palindromPrime time is "+count.getElapsedTime() +" milliseconds");
        }
}
