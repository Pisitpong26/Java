import java.util.Scanner;

public class Lab6Pro6_64010609 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Account[] account = new Account[10];

       intitialBalance(account);

       do {
           System.out.print("Enter an id : ");
           int id = input.nextInt();

           if (isValidID(id, account)){
               int choice;
               do {
                   choice = displayMainMenu(input);
                   if (isTransaction(choice)){
                       executeTransaction(choice, account, id, input);
                   }
               }while(choice !=4);
           }
       }while(true);
   } 

   public static void intitialBalance(Account[] a){
       int intitialBalance = 100;
       for (int i = 0; i < a.length; i++){
           a[i] = new Account(i,intitialBalance);
       }
   }

   public static boolean isTransaction(int choice){
       return choice > 0 && choice < 4;
   }

   public static boolean isValidID(int id,Account[] a){
       for (int i = 0;i < a.length;i++){
            if (id == a[i].getId()){
                return true;
            }
       }
       return false;
   }

   public static int displayMainMenu(Scanner input){
       System.out.println("Main menu");
       System.out.println("1: check balance");
       System.out.println("2: withdraw");
       System.out.println("3: deposit");
       System.out.println("4: exite");
       System.out.print("Enter a choice : ");

       return input.nextInt();
   }

   public static void executeTransaction(int c,Account[] a,int id,Scanner input){
        if (c == 1){
            System.out.println("The balance is " + a[id].getBalance());
        }
        else if (c == 2){
            System.out.print("Enter an amount to withdraw: "); 
            a[id].withdraw(input.nextDouble());
        }
        else if (c == 3){
            System.out.print("Enter an amount to deposit: "); 
			a[id].deposit(input.nextDouble());
        }
   }
}
