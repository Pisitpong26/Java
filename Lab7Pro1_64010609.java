public class Lab7Pro1_64010609 {
    public static void main(String[] args) {
        Account a1 = new Account(1,200);
        SavingAccount a2 = new SavingAccount(1,200);
        CheckingAccount a3 = new CheckingAccount(1,200,-100);

        a1.setAnnualInterrestRate(1.5);
        a2.setAnnualInterrestRate(1.5);
        a3.setAnnualInterrestRate(1.5);

        a1.deposit(50);
        a2.deposit(50);
        a3.deposit(50);

        System.out.println("Checking Account");
        System.out.println("Balance is "+ a1.getBalance());
        System.out.println("Withdraw: 300");
        a1.withdraw(-300);
        System.out.println("Balance is " + a1.getBalance());
        System.out.println("This account was created at "+a1.toString());

        System.out.println("");
        System.out.println("Checking Account");
        System.out.println("Balance is "+ a2.getBalance());
        System.out.println("Withdraw: 300");
        a2.withdraw(300);
        System.out.println("Balance is " + a2.getBalance());
        System.out.println("This account was created at "+a2.toString());

        System.out.println("");
        System.out.println("Checking Account");
        System.out.println("Overdraft Limit: "+ a3.getOverdraft());
        System.out.println("Balance is "+ a3.getBalance());
        System.out.println("Withdraw: 400");
        a3.withdraw(351);
        System.out.println("Balance is " + a3.getBalance());
        System.out.println("This account was created at "+a3.toString());
        
    }
    
}
