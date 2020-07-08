package JavaLearning;

public class LoginPage {
	
	public static  void getuserDetails(String username) {
		System.out.println("getting user details" + username);
		
	}

	public void login() {
		System.out.println("default login");
	}
	public void login(String fbId) {
		
		
	}
	public void login(long phoneNumber) {
		System.out.println("login with phonenumber" + phoneNumber);

	}

	public void login(String username , String Pwd) {

	}
	

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.login();
		lp.login("saroj2310", "saroj12345");

	}

}
