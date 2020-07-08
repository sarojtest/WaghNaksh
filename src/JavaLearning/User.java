package JavaLearning;

public class User {
	
	// Class variables
	String name;
	String emailId;
	long phoneNumber;
	boolean isActive;
	
	// class methods
	public String getUserDetails(String userName) {
		if (userName.equals("Tom")) {
			return "Apple MacBook";
			
		}
		else if (userName.equals("Steve")) {
			return "Samsung- S8";
			
		}
		else {
			System.out.println("username not found" + userName);
			return "msg is user not found here";
		}
	}
	
	public long getUserPhoneNumber(String username) {
		if (username.equals("Tom")) {
			return 82506319;
			
		}
		else if (username.equals("Steve")) {
			return 954353;
			
		}
		else {
			System.out.println("username not found" + username);
			return -1;
		}
		
	}
	
	

	public static void main(String[] args) {
		
		User user1= new User();
		user1.name = "Tom";
		String itemname= user1.getUserDetails(user1.name);
		System.out.println(itemname);
		
		long phn=user1.getUserPhoneNumber(user1.name);
		System.out.println(phn);
  
		
	}

}
