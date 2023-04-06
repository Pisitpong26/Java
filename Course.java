public class Course {
    private String courseName;
    private String[] students = new String[1];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }

    public void addStudent(String student){
        if (numberOfStudents == students.length){
                String[] newStudent = new String[students.length+1];
                for (int i = 0; i < numberOfStudents; i++){
                    newStudent[i] = students[i]; 
                }
                students = newStudent;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student){
        int check = -1; 
        for(int i = 0; i < numberOfStudents; i++){
                if (students[i] == student){
                    check = i;
                }
        }

        if (check >= 0){
            String[] newCheck = new String[students.length - 1];
            for (int i = 0,j = 0; i < newCheck.length; i++,j++){
                if (i == check){
                    j++;
                }
                newCheck[i] = students[j];   
            }
        this.students = newCheck;
        numberOfStudents--;
        }
        else {
                System.out.println(student + "is not in the course" + courseName );
        }
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void clear(){
        students = new String[1];
        numberOfStudents = 0;
    }
}
