package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {

		LoginPage lp =new LoginPage();
		
		lp.search();
		lp.header("Google Login");
		lp.title("Google account login");
		lp.doLogin();
		
		System.out.println("----------");
		HomePage hp= new HomePage();
		hp.search();
		
		// topcasting can be done
		System.out.println("----");
		Page p= new LoginPage();
		p.search();
		p.header("facebook");
		p.title("FB login");
		//p.dologin()  is not possible , refernce type check
	}

}
