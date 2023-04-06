public class Lab5Pro1_64010609 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterrestRate(4.5);

        System.out.println("Account ID : "+account.getId());
        System.out.println("Account Balance : "+account.getBalance());

        System.out.println("Withdraw 2500");
        account.withdraw(2500);
        System.out.println("Deposit 3000");
        account.deposit(3000);

        System.out.println("Account Balance : "+account.getBalance());
        System.out.println("Monthly Interest : "+account.getMonthlyInterest());
        System.out.println("Date when this account was created : "+account.getDateCreated());
    }
}
