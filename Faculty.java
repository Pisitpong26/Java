public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(){
        super();
    }

    public Faculty(String name,String address,String phoneNumber,String emailAddress,double office,double salary,String officeHours,String rank){
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public void setOfficeHours(String officeHours){
        this.officeHours = officeHours;
    }

    public String getOfficeHours(){
        return officeHours;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    public String getRank(){
        return rank;
    }

    public String toString(){
        return super.toString()+"\nOffice hours" + getOfficeHours()+
               "\nRank : " + getRank();
    }
}
