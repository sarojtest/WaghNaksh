package WebDriverArch;

public class LoginPageTest {
	static WebDriver driver;

	public static void main(String[] args) {
      
		String browser = "chrome";
	//	WebDriver driver =new ChromeDriver();
	//	WebDriver driver = new Firefoxdriver();
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new Firefoxdriver();
			
		}
		driver.get("http://www.google.com");
		driver.findElement("username");
		driver.findElement("password");
		driver.findElement("login");
		
		System.out.println(driver.getTitle());
		
	}

}
