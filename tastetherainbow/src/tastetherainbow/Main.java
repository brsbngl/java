package tastetherainbow;

public class Main {

	public static void main(String[] args) {
		
		User student = new User();
	    student.setUsername("Baris");
		student.setPassword("0606");
		
		
		User instructor = new User();
		instructor.setUsername("Engin");
		instructor.setPassword("1881");
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
    	InstructorManager instructorManager = new InstructorManager();
    	instructorManager.add(instructor);

	}

}
