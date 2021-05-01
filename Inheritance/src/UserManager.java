
public class UserManager {
	
	public void Add(User user) {
		
		System.out.println(user.userName +" adlý kullanýcý sisteme eklendi.");
	}
	
	public void AddMultiple(User [] users) {
		
		for (User user : users) {
			
			Add(user);
			
		}
		
	}
	
	

}
