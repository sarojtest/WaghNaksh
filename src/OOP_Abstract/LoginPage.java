package OOP_Abstract;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("login page---default constructor");
	}

	@Override
	public void header(String name) {
		System.out.println("login page ----header" + name);
		
	}

	@Override
	public void title(String title) {
		System.out.println("login page ----title" + title);
		
	}
	// own methods of LoginPage login
	public void doLogin() {
		System.out.println("loginpage ----dologin");
		
	}

}
