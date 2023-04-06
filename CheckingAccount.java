public class CheckingAccount extends Account {
    private double overdraft;

    public CheckingAccount (){
        super();
        overdraft = -100;
    }

    public CheckingAccount (int id,double balance,double overdraft){
        super(id,balance);
        this.overdraft = overdraft;
    }

    public void setOverdraft(double overdraft){
        this.overdraft = overdraft;
    }

    public double getOverdraft(){
        return overdraft;
    }

    public void withdraw (double withdraw){
        if (withdraw <= getBalance() - overdraft && withdraw>0){
            setBalance(getBalance()-withdraw);
        }
        else {
            System.out.println("Error you cannot withdraw over overdrraft");
        }
    }

    public String toString() {
		return super.toString();
	}

}
