public class Lab6Pro2_64010609 {
    public static void main(String[] args) {
        Course java = new Course("OOP");
        
        java.addStudent("1");
        java.addStudent("2");
        java.addStudent("3");

        java.dropStudent("3");


        System.out.println("The student in the course : " + java.getCourseName());

        String[] students = java.getStudents();
        for(int i=0;i< java.getNumberOfStudents();i++){
            System.out.println(students[i]);
        }

    }
}
