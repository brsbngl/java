package tastetherainbow;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println(user.getUsername() + " Successfully Added!");
	}
	
	

}
