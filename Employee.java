import java.util.Date;

public class Employee extends Person {
    private double office;
    private double salary;
    private Date dateHired;

    public Employee(){
        super();
        salary = 10000;
        dateHired = new Date();
    }

    public Employee(String name,String address,String phoneNumber,String emailAddress,double office,double salary){
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        dateHired = new Date();
    }

    public void setOffice(Double office){
        this.office = office;
    }

    public double getOffice(){
        return office;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setDateHired(Date dateHired){
        this.dateHired = dateHired;
    }

    public String getDateHired(){
        return dateHired.toString();
    }

    public String toString(){
        return super.toString()+ "\nOffice : " + getOffice() + 
               "\nSalary : " + getSalary() + "\nDate Hired : " + getDateHired();
    }

}
