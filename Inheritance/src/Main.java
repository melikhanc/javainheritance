
public class Main {

	public static void main(String[] args) {
		
		User user= new User();
		
		Student mcelebi = new Student();
		mcelebi.studentName = "Melikhan";
		mcelebi.userName = "mcelebi";
		
		Instructor edemirog = new Instructor();
		edemirog.ýnstructorName="Engin";
		edemirog.userName="edemirog";
		
		UserManager userManager = new UserManager();
		
		User [] users={mcelebi,edemirog};
		
		userManager.Add(edemirog);
		userManager.Add(mcelebi);
	
		
		

	}

}
