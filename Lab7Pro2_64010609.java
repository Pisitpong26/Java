public class Lab7Pro2_64010609 {
    public static void main(String[] args) {
        NewAccount account = new NewAccount("George", 1122, 1000);
		account.setAnnualInterrestRate(1.5);

		account.deposit(30);
		account.deposit(40);
		account.deposit(50);

		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);

		System.out.println("name: " + account.getName());
		System.out.println("ID : "+ account.getId());
		System.out.println("Annual interest rate: " + account.getAnnualInterestRate());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.println("Date					Type					Amount					Balance");
        
		for (int i = 0; i < account.getTransactions().size(); i++) {
			System.out.println((account.getTransactions()).get(i).getDate() + "		 "
								+account.getTransactions().get(i).getType() + "					"
								+account.getTransactions().get(i).getAmount() + "					"
								+account.getTransactions().get(i).getBalance()); 
		}
	}
}

