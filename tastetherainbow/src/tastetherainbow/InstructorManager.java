package tastetherainbow;

public class InstructorManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println(user.getUsername() +   " Successfully Added!");
		
	}

}
