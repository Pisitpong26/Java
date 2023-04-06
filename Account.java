import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    } 

    Account(int newId,double newBalance){
        if(newId>=0){
        id = newId;
        }
        else {
            System.out.println("Your id must more than 0 or equal 0");
        }

        if(newBalance>=0){
        balance = newBalance;
        }
        else {
            System.out.println("Your balance must more than 0 or equal 0");
        }
    }

    public void setId(int newId){
        if(newId>=0){
            id = newId;
        }
        else {
                System.out.println("Your id must more than 0 or equal 0");
        }
    }

    public int getId(){
        return id;
    }

    public void setBalance(double newBalance){
            balance = newBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void setAnnualInterrestRate(double newAnnualInterrestRate){
        if(newAnnualInterrestRate>=0){
            annualInterestRate = newAnnualInterrestRate;
        }
        else {
            System.out.println("Your annualInterestRate must more 0");
        } 
    }

    public String getDateCreated(){
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate(){

        return (annualInterestRate / 12)/100;
    }

    public double getMonthlyInterest(){
        return balance * (annualInterestRate / 12)/100;
    }

    public void withdraw(double withdraw){
        if(withdraw<=balance && withdraw>0){
        balance -= withdraw;}
        else {
            System.out.println("You can not withdraw more than your balance");
        }
    }

    public void deposit(double deposit){
        if (deposit > 0){
        balance += deposit;
        }
        else {System.out.println("Your deposit must more 0");}
    }

    public String toString() {
		return dateCreated.toString();
	}

}

