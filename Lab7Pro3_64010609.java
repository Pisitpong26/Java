public class Lab7Pro3_64010609 {
    public static void main(String[] args) {
        Person person = new Person("Kirito", "floor 78 SAO ", 
			"1112", "kirito@sao.com");

		Student student = new Student("Sherlock", "B112 Baker street", "4869", 
			"Holme@det.com", Student.FRESHMAN);

		Employee employee = new Employee("Miky", "Toman", "365",
			"miky80@toman.com", 886, 50000);

		Faculty faculty = new Faculty("Miyabi", "Japan", "A494949",
			"miya@japan.com", 56, 100000, "4pm to 6pm", "Celebrity");

		Staff staff = new Staff("Tom", "House", "000000000",
			"tomandjerry@cartoon.com", 12, 600000, "Actor");

		System.out.println(person.toString());
        System.out.println();
		System.out.println(student.toString());
        System.out.println();
		System.out.println(employee.toString());
        System.out.println();
		System.out.println(faculty.toString());
        System.out.println();
		System.out.println(staff.toString());
        System.out.println();

    }
}
