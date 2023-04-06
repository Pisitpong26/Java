public class Student extends Person {
    private int status;
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;

    public Student(){
        super();
        status = 1;
    }

    public Student(String name,String address,String phoneNumber,String emailAddress,int status){
        super(name,address,phoneNumber,emailAddress);
        this.status = status;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public String getStatus(){
        switch(status){
            case 1 : return "freshman"; 
			case 2 : return "sophomore"; 
			case 3 : return "junior"; 
			case 4 : return "senior";
			default : return "Unknown"; 
        }
    }

    public String toString(){
        return super.toString() + "\nStatus : " + getStatus();
    }
}
