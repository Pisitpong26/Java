public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(){
        name = "";
        address = "";
        phoneNumber = "";
        emailAddress = "";
    }

    public Person(String name,String address,String phoneNumber,String emailAddress){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setPhoneNumber(String phoneNumer){
        this.phoneNumber = phoneNumer;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setEmailAddres(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public String toString(){
        return "Name : "+name +"\nAddress : " + address +
               "\nPhone number: " + phoneNumber + "\nEmail Address" + emailAddress;
    }
}
