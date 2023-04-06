import java.util.ArrayList;
import java.util.Date;
public class NewAccount {

    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction>transactions;

    NewAccount(){
        name = "";
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
        transactions = new ArrayList<Transaction>();
    }

    NewAccount(int id,double balance){
        name = "";
        if(id>=0){
        this.id = id;
        }
        else {
            System.out.println("Your id must more than 0 or equal 0");
        }

        if(balance>=0){
        this.balance = balance;
        }
        else {
            System.out.println("Your balance must more than 0 or equal 0");
        }
        transactions = new ArrayList<Transaction>();
    }

    NewAccount (String name,int id,double balance){
        this(id,balance);
        this.name = name;

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
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

    public double getAnnualInterestRate(){
        return annualInterestRate;
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

    public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

    public void withdraw(double withdraw){
        if(withdraw<=balance && withdraw>0){
        balance -= withdraw;
        transactions.add(new Transaction('W', withdraw, balance, "Withdrawal from account"));}
        else {
            System.out.println("You can not withdraw more than your balance");
        }
    }
    
    public void deposit(double deposit){
        if (deposit > 0){
        balance += deposit;
        transactions.add(new Transaction('D', deposit, balance, "Deposit to acoount"));}
        else {System.out.println("Your deposit must more 0");}
    }

}
