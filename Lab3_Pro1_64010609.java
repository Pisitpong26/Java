public class Lab3_Pro1_64010609 {
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
    int sum = 0,reCheck,num=0,numArray=0,line=1;
    int palindrom[] = new int[1000];
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
    }
}
